package org.awda.middleware.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "appId", "timestamp", "v", "signature", "body" })
@Generated("jsonschema2pojo")
public class RegLog {

	@JsonProperty("appId")
	private String appId;
	@JsonProperty("timestamp")
	private Long timestamp;
	@JsonProperty("v")
	private String v;
	@JsonProperty("signature")
	private String signature;
	@JsonProperty("body")
	private BodyBs1 body;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("appId")
	public String getAppId() {
		return appId;
	}

	@JsonProperty("appId")
	public void setAppId(String appId) {
		this.appId = appId;
	}

	@JsonProperty("timestamp")
	public Long getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("v")
	public String getV() {
		return v;
	}

	@JsonProperty("v")
	public void setV(String v) {
		this.v = v;
	}

	@JsonProperty("signature")
	public String getSignature() {
		return signature;
	}

	@JsonProperty("signature")
	public void setSignature(String signature) {
		this.signature = signature;
	}

	@JsonProperty("body")
	public BodyBs1 getBody() {
		return body;
	}

	@JsonProperty("body")
	public void setBody(BodyBs1 body) {
		this.body = body;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "RegLog [appId=" + appId + ", timestamp=" + timestamp + ", v=" + v + ", signature=" + signature
				+ ", body=" + body + ", additionalProperties=" + additionalProperties + "]";
	}
	
	

}