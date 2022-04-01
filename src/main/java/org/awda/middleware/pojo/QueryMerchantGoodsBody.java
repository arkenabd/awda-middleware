package org.awda.middleware.pojo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class QueryMerchantGoodsBody implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String merchantCode;
	@NotEmpty
	private String goodsCode;
	private String appId;
	
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
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
		return "QueryMerchantGoodsBody [merchantCode=" + merchantCode + ", goodsCode=" + goodsCode + ", appId=" + appId
				+ "]";
	}
	

}
