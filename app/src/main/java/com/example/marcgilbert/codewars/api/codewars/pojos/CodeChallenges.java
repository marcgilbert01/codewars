package com.example.marcgilbert.codewars.api.codewars.pojos;

public class CodeChallenges {

    private String totalCompleted;

    private String totalAuthored;

    public String getTotalCompleted() {
        return totalCompleted;
    }

    public void setTotalCompleted(String totalCompleted) {
        this.totalCompleted = totalCompleted;
    }

    public String getTotalAuthored() {
        return totalAuthored;
    }

    public void setTotalAuthored(String totalAuthored) {
        this.totalAuthored = totalAuthored;
    }

    @Override
    public String toString() {
        return "ClassPojo [totalCompleted = " + totalCompleted + ", totalAuthored = " + totalAuthored + "]";
    }

}
