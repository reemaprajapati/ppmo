package com.example.otimus.ppmo.model;

/**
 * Created by Ichha on 8/6/2017.
 */

public class Settings {

    private String title;
    private String description;

    public Settings() {
    }

    public Settings(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
