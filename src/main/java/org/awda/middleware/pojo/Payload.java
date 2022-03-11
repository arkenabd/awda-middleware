package org.awda.middleware.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload <T> {	

    private String appId;
    private Long timestamp;
    private String v;
    private String signature;
    private T body;

    public String getAppId() {
        return appId;
    }
    public T getBody() {
        return body;
    }
    public void setBody(T body) {
        this.body = body;
    }
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String getV() {
        return v;
    }
    public void setV(String v) {
        this.v = v;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

	@Override
	public String toString() {
		return "Payload [appId=" + appId + ", timestamp=" + timestamp + ", v=" + v + ", signature=" + signature
				+ ", body=" + body + "]";
	}

 
}