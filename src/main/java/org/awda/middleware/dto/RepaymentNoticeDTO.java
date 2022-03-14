package org.awda.middleware.dto;

import java.io.Serializable;
import java.util.List;

import org.awda.middleware.pojo.RepaymentNoticeBody;

public class RepaymentNoticeDTO {
	
	private static final long serialVersionUID = 1L;
	
	private List<RepaymentNoticeBody> body = null;

	public List<RepaymentNoticeBody> getBody() {
		return body;
	}

	public void setBody(List<RepaymentNoticeBody> body) {
		this.body = body;
	}


}