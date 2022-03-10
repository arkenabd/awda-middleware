package org.awda.middleware.pojo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class SignPageBody implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String merchantCode;
	@NotEmpty
	private String orderNo;
	
	
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
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
		return "SignPageBody [merchantCode=" + merchantCode + ", orderNo=" + orderNo + "]";
	}
	
	

}
