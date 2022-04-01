package org.awda.middleware.pojo;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

public class EligibleCheckBody implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String merchantCode;
	@NotEmpty
	private String goodsCode;
	@NotEmpty
	private String mobile;
	@NotNull
	private Long amount;
	@NotEmpty
	private String transType;
	private String promotionCode;
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
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getPromotionCode() {
		return promotionCode;
	}
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
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
		return "EligibleCheckBody [merchantCode=" + merchantCode + ", goodsCode=" + goodsCode + ", mobile=" + mobile
				+ ", amount=" + amount + ", transType=" + transType + ", promotionCode=" + promotionCode + ", appId="
				+ appId + "]";
	}
	

}
