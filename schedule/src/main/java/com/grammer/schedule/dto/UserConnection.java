package com.grammer.schedule.dto;

public class UserConnection {

    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void close() {
        System.out.println("connection close");
    }
}
