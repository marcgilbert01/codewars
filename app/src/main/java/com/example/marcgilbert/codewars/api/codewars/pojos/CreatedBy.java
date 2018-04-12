package com.example.marcgilbert.codewars.api.codewars.pojos;

public class CreatedBy {

    private String username;

    private String url;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ClassPojo [username = " + username + ", url = " + url + "]";
    }

}
