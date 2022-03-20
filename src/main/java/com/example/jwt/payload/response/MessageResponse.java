package com.example.jwt.payload.response;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 2/27/22
 */
public class MessageResponse {

    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

