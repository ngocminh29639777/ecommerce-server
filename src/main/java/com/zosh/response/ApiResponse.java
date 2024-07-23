package com.zosh.response;

public class ApiResponse {
  //file tu tao  
    private String message;
    private boolean status;

    // Default constructor
    public ApiResponse() {
    }

    // Parameterized constructor
    public ApiResponse(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    // Getter and Setter methods
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}