package com.teksystems.finish;

public abstract class AudioFile {
    private String title;
    private String duration;

    public AudioFile(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
