package com.veiga.workshopmongo.dto;

import java.util.Date;

public class CommentDTO implements java.io.Serializable {
    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {
        // Default constructor
    }

    public CommentDTO(String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
