package com.example.jawaban_uts_revandra;

import java.util.Date;

public class Berita {
    String judul;
    String content;
    int min_age;
    Date rilis;
    String category;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public Date getRilis() {
        return rilis;
    }

    public void setRilis(Date rilis) {
        this.rilis = rilis;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    String picture;
    public Berita(String judul,
            String content,
            int min_age,
            Date rilis,
            String category,
            String picture)
    {
        this.judul = judul;
        this.content = content;
        this.min_age = min_age;
        this.rilis = rilis;
        this.category = category;
        this.picture = picture;}

}
