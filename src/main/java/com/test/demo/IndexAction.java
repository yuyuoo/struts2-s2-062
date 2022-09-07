package com.test.demo;

public class IndexAction {
    private String payload;

    public String execute() throws Exception{
        return "success";
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}