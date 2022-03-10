package org.awda.middleware.util;

import java.util.Map;

import org.apache.camel.Exchange;
import org.awda.middleware.pojo.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratePayload {

	private static final Logger log = LoggerFactory.getLogger(GeneratePayload.class);
	
	@Autowired
	private ObjectMapper objectMapper;
	
	public void generatePayload(String appId, Exchange exchange) throws Exception {
		Payload<Object> payload = new Payload<Object>();
		Map<String, Object> body = objectMapper.convertValue(exchange.getIn().getBody(), new TypeReference<Map<String,Object>>() {});
		payload.setBody(body);
		payload.setAppId(appId);
		payload.setV("1.0");
		payload.setTimestamp(exchange.getProperty("timestamp", Long.class));
		
		exchange.getIn().setBody(payload);
	}

}