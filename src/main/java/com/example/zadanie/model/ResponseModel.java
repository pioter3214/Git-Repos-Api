package com.example.zadanie.model;

import java.util.List;

public class ResponseModel {
   
    private String name;
    private String login;
    private List<BranchResponse> branches;

    public ResponseModel() {
    }

    public ResponseModel(String name, String login, List<BranchResponse> branches) {
        this.name = name;
        this.login = login;
        this.branches = branches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<BranchResponse> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchResponse> branches) {
        this.branches = branches;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", branches=" + branches +
                '}';
    }
}
