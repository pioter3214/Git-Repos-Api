package com.example.zadanie.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorModel {
    @JsonProperty("status")
    private int httpStatusCode;
    @JsonProperty("message")
    private String message;

    public ErrorModel() {
    }

    public ErrorModel(int httpStatusCode, String message) {
        this.httpStatusCode = httpStatusCode;
        this.message = message;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorModel{" +
                "httpStatusCode=" + httpStatusCode +
                ", message='" + message + '\'' +
                '}';
    }
}