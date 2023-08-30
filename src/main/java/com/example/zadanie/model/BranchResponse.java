package com.example.zadanie.model;

public class BranchResponse {
    private String branchName;
    private String lashSHA;


    public BranchResponse() {
    }

    public BranchResponse(String name, String sha) {
        this.branchName = name;
        this.lashSHA = sha;
    }

    public String getName() {
        return branchName;
    }

    public void setName(String name) {
        this.branchName = name;
    }

    public String getSha() {
        return lashSHA;
    }

    public void setSha(String sha) {
        this.lashSHA = sha;
    }

    @Override
    public String toString() {
        return "BranchResponse{" +
                "name='" + branchName + '\'' +
                ", sha='" + lashSHA + '\'' +
                '}';
    }
}
