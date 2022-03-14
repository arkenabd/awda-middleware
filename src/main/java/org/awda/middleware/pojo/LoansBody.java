package org.awda.middleware.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class LoansBody implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String mobile;
	private String orderStatus;
	@NotNull
	private Integer pageNum;
	@NotNull
	private Integer pageSize;

	public String getMobile() {
	return mobile;
	}

	public void setMobile(String mobile) {
	this.mobile = mobile;
	}

	public String getOrderStatus() {
	return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
	}

	public Integer getPageNum() {
	return pageNum;
	}

	public void setPageNum(Integer pageNum) {
	this.pageNum = pageNum;
	}

	public Integer getPageSize() {
	return pageSize;
	}

	public void setPageSize(Integer pageSize) {
	this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "Loans [mobile=" + mobile + ", orderStatus=" + orderStatus + ", pageNum=" + pageNum + ", pageSize="
				+ pageSize + "]";
	}

}
