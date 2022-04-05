package org.awda.middleware.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FilterResponse implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		String respBs = exchange.getIn().getBody().toString();
		if (respBs.contains("http")&&respBs.contains("code")) {
			
			respBs = respBs.replaceFirst(Pattern.quote("?"), Matcher.quoteReplacement("[param]"));
			
		}
		
		exchange.setProperty("respBs", respBs);
	}

}
