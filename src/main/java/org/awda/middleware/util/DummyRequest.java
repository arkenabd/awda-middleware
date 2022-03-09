package org.awda.middleware.util;

import org.awda.middleware.pojo.RegLog;
import org.awda.middleware.pojo.RegLogBody;
import org.springframework.context.annotation.Bean;

public class DummyRequest {
	
	@Bean
	public RegLog request() {
		RegLog request = new RegLog();
		request.setAppId("123456");
		request.setTimestamp(1558923813);
		request.setV("1.0");
		RegLogBody body = new RegLogBody();
		body.setName("Tobias");
		request.setBody(body);
		return request;
	}

}
