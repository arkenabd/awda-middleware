package org.awda.middleware.pojo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class QueryMerchantGoodsBody implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String merchantCode;
	@NotEmpty
	private String goodsCode;
	
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
	
	@Override
	public String toString() {
		return "QueryMerchantGoodsBody [merchantCode=" + merchantCode + ", goodsCode=" + goodsCode + "]";
	}
	

}
