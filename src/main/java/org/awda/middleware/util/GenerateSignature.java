package org.awda.middleware.util;

import org.apache.camel.Exchange;

public class GenerateSignature {

	public void process(String input, Exchange exchange) throws Exception {
		try {
			//logic for generating signature
			exchange.setProperty("signature", "sign value");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
