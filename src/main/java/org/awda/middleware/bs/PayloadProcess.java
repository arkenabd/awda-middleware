package org.awda.middleware.bs;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.awda.middleware.pojo.*;
import org.awda.middleware.util.GenerateSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class PayloadProcess  implements Processor {
	private static final Logger log = LoggerFactory.getLogger(PayloadProcess.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		
		Payload<BodyBs1> mapper = objectMapper.convertValue(exchange.getIn().getBody(), new TypeReference<Payload<BodyBs1>>() {});
		log.info("Final Payload  : "+objectMapper.writeValueAsString(mapper));

	
	}

}
