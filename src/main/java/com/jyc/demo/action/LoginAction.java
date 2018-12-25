package com.jyc.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String execute(){
        System.out.println("进入了excute 方法");
        System.out.println(username);
        return SUCCESS;
    }
}
