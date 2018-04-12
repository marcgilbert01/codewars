package com.example.marcgilbert.codewars.api.codewars.pojos;

import java.util.List;

public class Comment {

    public String id;
    public String commentReferenceId;
    public String createdAt;
    public Integer editCount;
    public Extra extra;
    public Object label;
    public Object lastEditedOn;
    public String markdown;
    public Object masked;
    public Object maskedById;
    public String state;
    public String updatedAt;
    public String userId;
    public List<Vote> votes = null;
    public Integer votesScore;
    public List<Comment> comments = null;

}
