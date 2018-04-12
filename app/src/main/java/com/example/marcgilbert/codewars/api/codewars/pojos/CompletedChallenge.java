package com.example.marcgilbert.codewars.api.codewars.pojos;

public class CompletedChallenge {

    private String id;

    private String name;

    private String slug;

    private String[] completedLanguages;

    private String completedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String[] getCompletedLanguages() {
        return completedLanguages;
    }

    public void setCompletedLanguages(String[] completedLanguages) {
        this.completedLanguages = completedLanguages;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", name = " + name + ", slug = " + slug + ", completedLanguages = " + completedLanguages + ", completedAt = " + completedAt + "]";
    }

}
