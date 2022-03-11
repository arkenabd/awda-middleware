package org.awda.middleware.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class CreateOrderBody implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String merchantCode;
	@NotEmpty
	private String goodsCode;
	@NotEmpty
	private String tenor;
	@NotEmpty
	private String mobile;
	@NotNull
	private Long amount;
	@NotEmpty
	private String transType;
	@NotEmpty
	private String orderNo;
	private String promotionCode;
	private String qrisMerchantPan;
	private String qrisMerchantLocation;
	private String qrisMerchantName;
	private String qrisAcquirerName;
	private String qrisMerchantCode;
	private String qrisAcquirerCode;
	
	
	
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
	public String getTenor() {
		return tenor;
	}
	public void setTenor(String tenor) {
		this.tenor = tenor;
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
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getPromotionCode() {
		return promotionCode;
	}
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}
	public String getQrisMerchantPan() {
		return qrisMerchantPan;
	}
	public void setQrisMerchantPan(String qrisMerchantPan) {
		this.qrisMerchantPan = qrisMerchantPan;
	}
	public String getQrisMerchantLocation() {
		return qrisMerchantLocation;
	}
	public void setQrisMerchantLocation(String qrisMerchantLocation) {
		this.qrisMerchantLocation = qrisMerchantLocation;
	}
	public String getQrisMerchantName() {
		return qrisMerchantName;
	}
	public void setQrisMerchantName(String qrisMerchantName) {
		this.qrisMerchantName = qrisMerchantName;
	}
	public String getQrisAcquirerName() {
		return qrisAcquirerName;
	}
	public void setQrisAcquirerName(String qrisAcquirerName) {
		this.qrisAcquirerName = qrisAcquirerName;
	}
	public String getQrisMerchantCode() {
		return qrisMerchantCode;
	}
	public void setQrisMerchantCode(String qrisMerchantCode) {
		this.qrisMerchantCode = qrisMerchantCode;
	}
	public String getQrisAcquirerCode() {
		return qrisAcquirerCode;
	}
	public void setQrisAcquirerCode(String qrisAcquirerCode) {
		this.qrisAcquirerCode = qrisAcquirerCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CreateOrderBody [merchantCode=" + merchantCode + ", goodsCode=" + goodsCode + ", tenor=" + tenor
				+ ", mobile=" + mobile + ", amount=" + amount + ", transType=" + transType + ", orderNo=" + orderNo
				+ ", promotionCode=" + promotionCode + ", qrisMerchantPan=" + qrisMerchantPan
				+ ", qrisMerchantLocation=" + qrisMerchantLocation + ", qrisMerchantName=" + qrisMerchantName
				+ ", qrisAcquirerName=" + qrisAcquirerName + ", qrisMerchantCode=" + qrisMerchantCode
				+ ", qrisAcquirerCode=" + qrisAcquirerCode + "]";
	}	
}
