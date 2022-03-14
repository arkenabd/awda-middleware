package org.awda.middleware.pojo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class CancelOrderBody implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String mobile;
	@NotEmpty
	private String orderNo;

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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CancelOrderBody [mobile=" + mobile + ", orderNo=" + orderNo + "]";
	}
	
	

}
