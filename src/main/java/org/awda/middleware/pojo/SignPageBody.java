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
	private String appId;
	@NotEmpty
	private String redirectUrl;
	@NotEmpty
	private String mobile;
	
	
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
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "SignPageBody [merchantCode=" + merchantCode + ", orderNo=" + orderNo + ", appId=" + appId
				+ ", redirectUrl=" + redirectUrl + ", mobile=" + mobile + "]";
	}
	
	
}
