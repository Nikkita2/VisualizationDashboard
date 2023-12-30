package com.Visualization.Dashboard;

import java.util.List;

public class BaseResponse {
	private int responseCode;
    private String responseMessage;
    private Object responseBody;
    private long totalRecords;
    private List<Object> listResponse;
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public Object getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}
	public long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<Object> getListResponse() {
		return listResponse;
	}
	public void setListResponse(List<Object> listResponse) {
		this.listResponse = listResponse;
	}
    

}
