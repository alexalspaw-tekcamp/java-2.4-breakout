package com.teksystems.finish;

public class Podcast extends AudioFile {
    private String host;

    public Podcast(String title, String duration, String host) {
        super(title, duration);
        this.host = host;
    }

    @Override
    public String getInfo() {
        return "Title: " + getTitle() + "Host: " + host;
    }
}
