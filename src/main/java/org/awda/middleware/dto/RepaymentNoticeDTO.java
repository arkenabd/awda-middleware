package org.awda.middleware.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import org.awda.middleware.pojo.RepaymentNoticeBody;

public class RepaymentNoticeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Valid
	private List<RepaymentNoticeBody> body = null;

	public List<RepaymentNoticeBody> getBody() {
		return body;
	}

	public void setBody(List<RepaymentNoticeBody> body) {
		this.body = body;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


}