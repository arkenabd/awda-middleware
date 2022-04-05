package org.awda.middleware.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class UpdateProductBody implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotEmpty
    private String merchantCode;
	@NotEmpty	
    private String goodsName;
	@NotEmpty
    private String goodsCode;
    @NotNull
    private Long maxActiveLoan;
    private String description;
    private Byte installment;
    @NotEmpty
    private String appId;
    
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public Long getMaxActiveLoan() {
		return maxActiveLoan;
	}
	public void setMaxActiveLoan(Long maxActiveLoan) {
		this.maxActiveLoan = maxActiveLoan;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Byte getInstallment() {
		return installment;
	}
	public void setInstallment(Byte installment) {
		this.installment = installment;
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
		return "UpdateProductBody [merchantCode=" + merchantCode + ", goodsName=" + goodsName + ", goodsCode="
				+ goodsCode + ", maxActiveLoan=" + maxActiveLoan + ", description=" + description + ", installment="
				+ installment + ", appId=" + appId + "]";
	} 
    
    
}
