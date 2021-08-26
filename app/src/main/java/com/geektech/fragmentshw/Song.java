package com.geektech.fragmentshw;

public class Song {

    private String number;
    private String song;
    private String artist;
    private String duration;

    public Song(String number, String song, String artist, String duration) {
        this.number = number;
        this.song = song;
        this.artist = artist;
        this.duration = duration;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
