package org.awda.middleware.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageValidator {
	private static final Logger log = LoggerFactory.getLogger(MessageValidator.class);
	public void process(Exchange exchange) throws Exception {
		ObjectMapper oMapper = new ObjectMapper();
		Map<String,Object> map = oMapper.readValue(exchange.getIn().getBody().toString(), Map.class);
		log.info(exchange.getIn().getBody().toString());

		log.info("appId :"+map.get("appId").toString());
		log.info("body.mobile"+map.get("body").toString());
		/*ArrayList<String> errorList = new ArrayList<String>();
		Boolean isError = false;
		// validasi transaction type
		if (!trxtype.toUpperCase().equals(validTrx)) {
			isError = true;
			if (errorList.size() == 0) {
				errorList.add("Transaction Type " + trxtype + " is doesnt match with endpoint url : /" + validTrx);
			} else {
				errorList.add(";Transaction Type " + trxtype + " is doesnt match with endpoint url : /" + validTrx);
			}

		}

		// validasi whether body null
		if (exchange.getIn().getBody().toString().trim().length() == 0) {
			isError = true;
			if (errorList.size() == 0) {
				errorList.add("Body request was null");
			} else {
				errorList.add(";Body request was null");
			}

		}

		// validasi timestamp
		SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			format.parse(timestamp);
		} catch (ParseException e) {
			isError = true;
			if (errorList.size() == 0) {
				errorList.add("Timestamp " + timestamp + " is not valid");
			} else {
				errorList.add(";Timestamp " + timestamp + " is not valid");
			}

		}
		// validasi token

		if (isError == true) {
			String errMsg = "";
			for (int i = 0; i < errorList.size(); i++) {
				errMsg = errMsg + errorList.get(i);
			}
			throw new MessageErrorException(errMsg);
		}

	}

	public void processBodyCheck(String body, Exchange exchange) throws Exception {

		// validasi whether body null
		try {
			System.out.println(
					"[" + exchange.getProperty("transId") + "] Body :" + exchange.getIn().getBody().toString().trim());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new MessageBodyNullErrorException("Request payload message was null");
		}

	}

	public void process504(String body, Exchange exchange) throws Exception {

		// validasi whether body null
		if (body.contains("504 Gateway Time-out")) {
			throw new MessageBodyNullErrorException("504 Gateway Time-out.The server didn't respond in time.");
		}

	}*/
	}
}
