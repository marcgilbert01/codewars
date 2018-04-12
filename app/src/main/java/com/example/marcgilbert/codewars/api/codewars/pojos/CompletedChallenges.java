package com.example.marcgilbert.codewars.api.codewars.pojos;

public class CompletedChallenges {

    private CompletedChallenge[] data;

    private String totalItems;

    private String totalPages;

    public CompletedChallenge[] getData() {
        return data;
    }

    public void setData(CompletedChallenge[] data) {
        this.data = data;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "ClassPojo [data = " + data + ", totalItems = " + totalItems + ", totalPages = " + totalPages + "]";
    }

}
