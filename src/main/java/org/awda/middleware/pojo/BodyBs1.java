package org.awda.middleware.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"mobile",
"origin",
"nik",
"name",
"provinceId",
"cityId",
"areaId",
"villageId",
"streetLine",
"email",
"birthday",
"birthplace",
"religion",
"educationLevel",
"maritalStatus",
"postCode",
"rt",
"rw",
"ktpPhotos"
})
@Generated("jsonschema2pojo")
public class BodyBs1 {

@JsonProperty("mobile")
private String mobile;
@JsonProperty("origin")
private String origin;
@JsonProperty("nik")
private String nik;
@JsonProperty("name")
private String name;
@JsonProperty("provinceId")
private String provinceId;
@JsonProperty("cityId")
private String cityId;
@JsonProperty("areaId")
private String areaId;
@JsonProperty("villageId")
private String villageId;
@JsonProperty("streetLine")
private String streetLine;
@JsonProperty("email")
private String email;
@JsonProperty("birthday")
private String birthday;
@JsonProperty("birthplace")
private String birthplace;
@JsonProperty("religion")
private String religion;
@JsonProperty("educationLevel")
private String educationLevel;
@JsonProperty("maritalStatus")
private String maritalStatus;
@JsonProperty("postCode")
private String postCode;
@JsonProperty("rt")
private String rt;
@JsonProperty("rw")
private String rw;
@JsonProperty("ktpPhotos")
private List<String> ktpPhotos = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("mobile")
public String getMobile() {
return mobile;
}

@JsonProperty("mobile")
public void setMobile(String mobile) {
this.mobile = mobile;
}

@JsonProperty("origin")
public String getOrigin() {
return origin;
}

@JsonProperty("origin")
public void setOrigin(String origin) {
this.origin = origin;
}

@JsonProperty("nik")
public String getNik() {
return nik;
}

@JsonProperty("nik")
public void setNik(String nik) {
this.nik = nik;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("provinceId")
public String getProvinceId() {
return provinceId;
}

@JsonProperty("provinceId")
public void setProvinceId(String provinceId) {
this.provinceId = provinceId;
}

@JsonProperty("cityId")
public String getCityId() {
return cityId;
}

@JsonProperty("cityId")
public void setCityId(String cityId) {
this.cityId = cityId;
}

@JsonProperty("areaId")
public String getAreaId() {
return areaId;
}

@JsonProperty("areaId")
public void setAreaId(String areaId) {
this.areaId = areaId;
}

@JsonProperty("villageId")
public String getVillageId() {
return villageId;
}

@JsonProperty("villageId")
public void setVillageId(String villageId) {
this.villageId = villageId;
}

@JsonProperty("streetLine")
public String getStreetLine() {
return streetLine;
}

@JsonProperty("streetLine")
public void setStreetLine(String streetLine) {
this.streetLine = streetLine;
}

@JsonProperty("email")
public String getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("birthday")
public String getBirthday() {
return birthday;
}

@JsonProperty("birthday")
public void setBirthday(String birthday) {
this.birthday = birthday;
}

@JsonProperty("birthplace")
public String getBirthplace() {
return birthplace;
}

@JsonProperty("birthplace")
public void setBirthplace(String birthplace) {
this.birthplace = birthplace;
}

@JsonProperty("religion")
public String getReligion() {
return religion;
}

@JsonProperty("religion")
public void setReligion(String religion) {
this.religion = religion;
}

@JsonProperty("educationLevel")
public String getEducationLevel() {
return educationLevel;
}

@JsonProperty("educationLevel")
public void setEducationLevel(String educationLevel) {
this.educationLevel = educationLevel;
}

@JsonProperty("maritalStatus")
public String getMaritalStatus() {
return maritalStatus;
}

@JsonProperty("maritalStatus")
public void setMaritalStatus(String maritalStatus) {
this.maritalStatus = maritalStatus;
}

@JsonProperty("postCode")
public String getPostCode() {
return postCode;
}

@JsonProperty("postCode")
public void setPostCode(String postCode) {
this.postCode = postCode;
}

@JsonProperty("rt")
public String getRt() {
return rt;
}

@JsonProperty("rt")
public void setRt(String rt) {
this.rt = rt;
}

@JsonProperty("rw")
public String getRw() {
return rw;
}

@JsonProperty("rw")
public void setRw(String rw) {
this.rw = rw;
}

@JsonProperty("ktpPhotos")
public List<String> getKtpPhotos() {
return ktpPhotos;
}

@JsonProperty("ktpPhotos")
public void setKtpPhotos(List<String> ktpPhotos) {
this.ktpPhotos = ktpPhotos;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}