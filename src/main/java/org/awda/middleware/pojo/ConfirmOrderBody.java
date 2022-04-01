package org.awda.middleware.pojo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class ConfirmOrderBody implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String mobile;
	@NotEmpty
	private String orderNo;
	@NotEmpty
	private String status;
	private String appId;
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	@Override
	public String toString() {
		return "ConfirmOrderBody [mobile=" + mobile + ", orderNo=" + orderNo + ", status=" + status + ", appId=" + appId
				+ "]";
	}

	

}
