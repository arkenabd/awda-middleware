package org.awda.middleware.pojo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class CreateMerchantBody implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
    @NotBlank
    private String merchantName;
    @NotBlank
    private String merchantCode;
    private String description;
    @NotBlank
    private long mdr;
    @NotBlank
    private long tax;
    @NotBlank
    private String bankCode;
    @NotBlank
    private String bankAccount;
    @NotBlank
    private String address;
    @NotBlank
    private String mobile;


    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantCode() {
        return this.merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getMdr() {
        return this.mdr;
    }

    public void setMdr(long mdr) {
        this.mdr = mdr;
    }

    public long getTax() {
        return this.tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

	@Override
	public String toString() {
		return "CreateMerchantBody [merchantName=" + merchantName + ", merchantCode=" + merchantCode + ", description="
				+ description + ", mdr=" + mdr + ", tax=" + tax + ", bankCode=" + bankCode + ", bankAccount="
				+ bankAccount + ", address=" + address + ", mobile=" + mobile + "]";
	}
    
    
}