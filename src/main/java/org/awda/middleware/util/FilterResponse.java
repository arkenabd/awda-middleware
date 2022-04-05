package org.awda.middleware.util;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FilterResponse implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		String respBs = exchange.getIn().getBody().toString();
		if (respBs.contains("http")&&respBs.contains("code")) {
			
			respBs = respBs.replaceAll("\\?","[param]");
			
			
		}
		
		exchange.setProperty("respBs", respBs);
	}

}
