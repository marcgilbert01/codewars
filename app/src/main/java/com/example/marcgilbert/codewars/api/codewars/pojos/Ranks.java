package com.example.marcgilbert.codewars.api.codewars.pojos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Ranks {

    private Map<String, Rank> languages;

    private Rank overall;

    public Map<String, Rank> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, Rank> languages) {
        this.languages = languages;
    }

    public Rank getOverall() {
        return overall;
    }

    public void setOverall(Rank overall) {
        this.overall = overall;
    }

    @Override
    public String toString() {
        return "ClassPojo [languages = " + languages + ", overall = " + overall + "]";
    }
}
