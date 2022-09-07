package com.test.demo;

import com.opensymphony.xwork2.ActionSupport;

public class testAction extends ActionSupport {
    private String id;

    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String test() {
        System.err.println(getId());
        return SUCCESS;
    }

}