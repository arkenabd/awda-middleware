package org.awda.middleware.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class RepaymentNoticeBody implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@NotNull
	private Integer amount;
	@NotEmpty
	private String orderNo;
	@NotEmpty
	private String serialNo;
	

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

//	public String getAppId() {
//		return appId;
//	}
//
//	public void setAppId(String appId) {
//		this.appId = appId;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RepaymentNoticeBody [amount=" + amount + ", orderNo=" + orderNo + ", serialNo=" + serialNo + "]";
	}



	

}