package org.awda.middleware.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;

import org.apache.camel.Exchange;
import org.apache.commons.codec.digest.DigestUtils;
import org.awda.middleware.pojo.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.regex.Pattern;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenerateSignature {

	private static final Logger log = LoggerFactory.getLogger(GenerateSignature.class);

	@Autowired
	private ObjectMapper objectMapper;

	public static StringBuilder replaceAll(StringBuilder sb, String find, String replace) {
		return new StringBuilder(Pattern.compile(find).matcher(sb).replaceAll(replace));
	}

	public static Properties readProperties() {

		Properties props = new Properties();
		Path myPath = Paths.get("src/main/resources/application.properties");

		try {
			BufferedReader bf = Files.newBufferedReader(myPath, StandardCharsets.UTF_8);

			props.load(bf);
		} catch (IOException ex) {
			log.info(ex.getMessage());
		}

		return props;
	}

	public String getSecret(String appId) throws SQLException {
		PreparedStatement pst = null;
		ResultSet rs = null;
		Properties props = readProperties();
		String secret = "";
		String url = "jdbc:postgresql://"+props.getProperty("postgre.host")+":"+props.getProperty("postgre.port")+"/"+props.getProperty("postgre.db");
		log.info("url postgre partners :"+url);
		String user = props.getProperty("postgre.user");
		String passwd = props.getProperty("postgre.password");
		String table = props.getProperty("postgre.table.partners");
		try {
			Connection con = DriverManager.getConnection(url, user, passwd);
			pst = con.prepareStatement("SELECT secret FROM "+table+" where app_id=?");
			pst.setString(1, appId);
			rs = pst.executeQuery();

			while (rs.next()) {
				log.info("secret key : "+rs.getString(1));
				secret = rs.getString(1);
			}
			rs.close();
			pst.close();
		} catch (SQLException ex) {
			rs.close();
			pst.close();
			log.info(ex.getMessage());
		}
		return secret;
	}

	public void process(String input, Exchange exchange) throws Exception {
		try {
			String secret = this.getSecret(exchange.getProperty("appId").toString());
			// String secret = "23aRJ99i70SjkG4X5syOUg4";

			// appId: gudangada
			// apiKey: 23aRJ99i70SjkG4X5syOUg4

			// Convert generic POJO to Map
			Map<String, Object> map = objectMapper.convertValue(exchange.getIn().getBody(),
					new TypeReference<Map<String, Object>>() {
					});
			log.info("Body Bofore generate signature" + map.get("body"));

			if (map.containsKey("signature")) {
				map.remove("signature");
			}

			log.info("Body After generate signature" + map.get("body"));

			log.info("from generate signature" + map.toString());
			String[] keys = new String[map.size()];
			int i = 0;
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				keys[i++] = entry.getKey();
			}
			Arrays.sort(keys);
			StringBuilder stringBuilder = new StringBuilder();
			for (String key : keys) {
				stringBuilder.append(key);
				stringBuilder.append(":");

				if (key.equals("body")) {
					if (map.get(key) instanceof LinkedHashMap || map.get(key) instanceof ArrayList) {
						stringBuilder.append(objectMapper.writeValueAsString(map.get(key)).replace(" ", ""));
						continue;
					}
				}

				stringBuilder.append(map.get(key));
			}
			stringBuilder.append(secret);
			String str = stringBuilder.toString();
			str = stringBuilder.toString();

			log.info("String to encrypt: \n" + str);

			String signature = DigestUtils.md5Hex(str).toUpperCase();
			// String signature = "D6B27218CD6FEFB1EA802B9F47B8534D";

			// Generate Final Payload
			exchange.getIn().getBody(Payload.class).setSignature(signature);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}