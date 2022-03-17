package org.awda.middleware.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class CreateProductBody implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@NotEmpty
    private String merchantCode;
	@NotEmpty	
    private String productName;
	@NotEmpty
    private String merchantProductCode;
    @NotNull
    private Long maxActiveLoan;
    private String description;
    private Byte installment;
    
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getMerchantProductCode() {
		return merchantProductCode;
	}
	public void setMerchantProductCode(String merchantProductCode) {
		this.merchantProductCode = merchantProductCode;
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
	
	@Override
	public String toString() {
		return "CreateProductBody [merchantCode=" + merchantCode + ", productName=" + productName
				+ ", merchantProductCode=" + merchantProductCode + ", maxActiveLoan=" + maxActiveLoan + ", description="
				+ description + ", installment=" + installment + "]";
	}


}
