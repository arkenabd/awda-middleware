package org.awda.middleware.util;

import java.util.Arrays;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.commons.codec.digest.DigestUtils;
import org.awda.middleware.pojo.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenerateSignature {
	
	
	private static final Logger log = LoggerFactory.getLogger(GenerateSignature.class);
	
	@Autowired
	private ObjectMapper objectMapper;

	public void process(String input, Exchange exchange) throws Exception {
		try {
			String secret = "middleware";
			
//			Convert generic POJO to Map
			Map<String,Object> map = objectMapper.convertValue(exchange.getIn().getBody(), new TypeReference<Map<String, Object>>() {});
			if (map.containsKey("signature")) {
				map.remove("signature");
			}

			log.info("from generate signature"+map.toString());
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

	        log.info("String to encrypt: \n" + str);

	        
	        String signature = DigestUtils.md5Hex(str).toUpperCase();
	        
	        
	        //Generate Final Payload
	        exchange.getIn().getBody(Payload.class).setSignature(signature);

//	        String encodeStr = DigestUtils.md5Hex(str).toUpperCase();
	        
	        
	        //Generate Final Payload
//	        map.put("signature", encodeStr);
//	        log.info("Beta Payload :"+map.toString());
	       
//	        
//	        exchange.getOut().setBody(objectMapper.writeValueAsString(map));
//	       exchange.setProperty("signature", encodeStr);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}