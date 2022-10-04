package com.cts.eaution.integration.kafka.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author aadi
 *Defined a custom kafka message format
 */
public class CustomKafkaMessage implements Serializable {

	private static final long serialVersionUID = -6379716960366651110L;

	private String data;
	private String operation;
	@JsonProperty("timestamp") 
	private String timestamp;
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
@JsonCreator
	public CustomKafkaMessage(@JsonProperty("data") String data,@JsonProperty("operation")  String operation) {
		super();
		this.data = data;
		this.operation = operation;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		this.timestamp = timestamp.toString();
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


}
