package com.teksystems.finish;

public class Song extends AudioFile {
    private String artist;

    public Song(String title, String duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public String getInfo() {
        return "Title: " + getTitle() + "Artist: " + artist;
    }
}
