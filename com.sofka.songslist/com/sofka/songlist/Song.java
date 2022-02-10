package com.sofka.songlist;

import java.sql.Date;

public class Song {

    private int id;
    private String title;
    private Date date;
    private int duration;
    private String genre;
    private String description;
    
    public Song(int id, String title, Date date, int duration, String genre, String description) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}
