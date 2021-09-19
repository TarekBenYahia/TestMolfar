package com.example.testmolfar.Models;

public class MusicModel {
    public String title;
    public String description;
    public int image;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public MusicModel(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
}
