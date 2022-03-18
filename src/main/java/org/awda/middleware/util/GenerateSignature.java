package org.awda.middleware.util;

import java.util.Arrays;
import java.util.Map;

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
	
	public static StringBuilder replaceAll(StringBuilder sb, String find, String replace){
		return new StringBuilder(Pattern.compile(find).matcher(sb).replaceAll(replace));
	}

	public void process(String input, Exchange exchange) throws Exception {
		try {
			String secret = "XIZoR9RnSPaLfsYFqhLQCA";
			
//			Convert generic POJO to Map
			Map<String,Object> map = objectMapper.convertValue(exchange.getIn().getBody(), new TypeReference<Map<String, Object>>() {});
			log.info("Body Bofore generate signature"+map.get("body"));
			/*
			Map<String, Object> innerMap = (Map<String, Object>) map.get("body");
			
			
			
			if (innerMap.containsKey("merchantCode")) {
				//String val=(String) map.get("body");
				innerMap.replace("merchantCode", innerMap.get("merchantCode")+"haha");
				//map.replace(map.keySet().contains(map), map);
				log.info("horee");
			}
			*/
			
			if (map.containsKey("signature")) {
				map.remove("signature");
			}
			
			
			
			//((Map<String, Object>) map.get("body")).get("merchantCode");
			//((Map<String, Object>) map.get("body")).containsKey("merchantCode");
			
		
			
			log.info("Body After generate signature"+map.get("body"));
			
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
	          
	            if(key.equals("body")) {
	                stringBuilder.append(objectMapper.writeValueAsString(map.get(key)).replace(" ", ""));
	                continue;
	            }
	           
	            stringBuilder.append(map.get(key));
	        }
	        stringBuilder.append(secret);
	        
	        String str=stringBuilder.toString();
	        
	        if(str.contains("{")) {
	        
	        //replaceAll(stringBuilder, "0", "x");
	         str=stringBuilder.toString();
	        }else {
	        	String from = "\"";
		        String to = "";
		        String newfrom = "\"";
		        String newto = "";
		        stringBuilder = stringBuilder.replace(stringBuilder.indexOf(from), stringBuilder.indexOf(from) + from.length(), to);
		        stringBuilder = stringBuilder.replace(stringBuilder.indexOf(newfrom), stringBuilder.indexOf(newfrom) + newfrom.length(), to);
	        	str=stringBuilder.toString();
	        }
	        
	        
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