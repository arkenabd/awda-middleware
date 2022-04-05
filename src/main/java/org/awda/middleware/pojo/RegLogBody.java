package org.awda.middleware.pojo;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegLogBody implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String mobile;
	@NotEmpty
	private String origin;
	@NotEmpty
	private String nik;
	private String name;
	private String provinceId;
	private String cityId;
	private String areaId;
	private String villageId;
	private String streetLine;
	private String email;
	private String birthday;
	private String birthplace;
	private String religion;
	private String educationLevel;
	private String maritalStatus;
	private String postCode;
	private String rt;
	private String rw;
	private List<String> ktpPhotos = null;
	@NotEmpty
	private String appId;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getVillageId() {
		return villageId;
	}

	public void setVillageId(String villageId) {
		this.villageId = villageId;
	}

	public String getStreetLine() {
		return streetLine;
	}

	public void setStreetLine(String streetLine) {
		this.streetLine = streetLine;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getRt() {
		return rt;
	}

	public void setRt(String rt) {
		this.rt = rt;
	}

	public String getRw() {
		return rw;
	}

	public void setRw(String rw) {
		this.rw = rw;
	}

	public List<String> getKtpPhotos() {
		return ktpPhotos;
	}

	public void setKtpPhotos(List<String> ktpPhotos) {
		this.ktpPhotos = ktpPhotos;
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
		return "RegLogBody [mobile=" + mobile + ", origin=" + origin + ", nik=" + nik + ", name=" + name
				+ ", provinceId=" + provinceId + ", cityId=" + cityId + ", areaId=" + areaId + ", villageId="
				+ villageId + ", streetLine=" + streetLine + ", email=" + email + ", birthday=" + birthday
				+ ", birthplace=" + birthplace + ", religion=" + religion + ", educationLevel=" + educationLevel
				+ ", maritalStatus=" + maritalStatus + ", postCode=" + postCode + ", rt=" + rt + ", rw=" + rw
				+ ", ktpPhotos=" + ktpPhotos + ", appId=" + appId + "]";
	}

	

}