package com.example.marcgilbert.codewars.api.codewars.pojos;

public class Challenge {

    private String[] tags;

    private String totalStars;

    private String totalCompleted;

    private String approvedAt;

    private String url;

    private String id;

    private String publishedAt;

    private String[] languages;

    private String category;

    private Rank rank;

    private CreatedBy createdBy;

    private String description;

    private String name;

    private String totalAttempts;

    private String slug;

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getTotalStars() {
        return totalStars;
    }

    public void setTotalStars(String totalStars) {
        this.totalStars = totalStars;
    }

    public String getTotalCompleted() {
        return totalCompleted;
    }

    public void setTotalCompleted(String totalCompleted) {
        this.totalCompleted = totalCompleted;
    }

    public String getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt(String approvedAt) {
        this.approvedAt = approvedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalAttempts() {
        return totalAttempts;
    }

    public void setTotalAttempts(String totalAttempts) {
        this.totalAttempts = totalAttempts;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

}
