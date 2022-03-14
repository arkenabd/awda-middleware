package org.awda.middleware.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class CreateProductBody implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @NotBlank
    private String merchantCode;
    @NotBlank
    private String merchantProductCode;
    @NotBlank
    private String productName;
    @NotNull
    private Long maxActiveLoan;
    private String description;
    private Byte installment;


    public String getMerchantCode() {
        return this.merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantProductCode() {
        return this.merchantProductCode;
    }

    public void setMerchantProductCode(String merchantProductCode) {
        this.merchantProductCode = merchantProductCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getMaxActiveLoan() {
        return this.maxActiveLoan;
    }

    public void setMaxActiveLoan(Long maxActiveLoan) {
        this.maxActiveLoan = maxActiveLoan;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getInstallment() {
        return this.installment;
    }

    public void setInstallment(Byte installment) {
        this.installment = installment;
    }

	@Override
	public String toString() {
		return "CreateProductBody [merchantCode=" + merchantCode + ", merchantProductCode=" + merchantProductCode
				+ ", productName=" + productName + ", maxActiveLoan=" + maxActiveLoan + ", description=" + description
				+ ", installment=" + installment + "]";
	}
    
    
}
