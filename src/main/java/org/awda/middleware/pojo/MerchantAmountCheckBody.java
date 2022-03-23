package org.awda.middleware.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class MerchantAmountCheckBody implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String merchantCode;
	@NotEmpty
	private String mobile;
	@NotNull
	private Long amount;
	
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "MerchantAmountCheckBody [merchantCode=" + merchantCode + ", mobile=" + mobile + ", amount=" + amount
				+ "]";
	}
	
	

}
