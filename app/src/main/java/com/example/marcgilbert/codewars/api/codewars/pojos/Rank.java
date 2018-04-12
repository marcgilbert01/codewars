package com.example.marcgilbert.codewars.api.codewars.pojos;

public class Rank {
    private String rank;

    private String color;

    private String name;

    private String score;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ClassPojo [rank = " + rank + ", color = " + color + ", name = " + name + ", score = " + score + "]";
    }

}
