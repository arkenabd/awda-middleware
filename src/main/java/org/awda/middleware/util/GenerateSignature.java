package org.awda.middleware.util;

import java.util.Arrays;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.commons.codec.digest.DigestUtils;
import org.awda.middleware.pojo.RegLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GenerateSignature {
	
	
	private static final Logger log = LoggerFactory.getLogger(GenerateSignature.class);


	public void process(String input, Exchange exchange) throws Exception {
		try {
			String secret = "middleware";
			ObjectMapper oMapper = new ObjectMapper();
			Map<String,Object> map = oMapper.convertValue(exchange.getIn().getBody(RegLog.class), Map.class);
			log.info(exchange.getIn().getBody(RegLog.class).toString());

			log.info(map.toString());

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
	            stringBuilder.append(map.get(key));
	        }
	        stringBuilder.append(secret);
	        String str=stringBuilder.toString();
	        String encodeStr = DigestUtils.md5Hex(str).toUpperCase();
	       exchange.setProperty("signature", encodeStr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
