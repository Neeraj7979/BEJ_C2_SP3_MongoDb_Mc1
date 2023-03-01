package com.niit.bej.c2_sp3_NoSql_Mc1.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Music {
    @Id
    private int trackId;
    private String trackName;
    private double trackRating;
    private Artist trackArtist;

    public Music() {
    }

    public Music(int trackId, String trackName, double trackRating, Artist trackArtist) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackRating = trackRating;
        this.trackArtist = trackArtist;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public double getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(double trackRating) {
        this.trackRating = trackRating;
    }

    public Artist getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(Artist trackArtist) {
        this.trackArtist = trackArtist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return trackId == music.trackId && Double.compare(music.trackRating, trackRating) == 0 && Objects.equals(trackName, music.trackName) && Objects.equals(trackArtist, music.trackArtist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, trackName, trackRating, trackArtist);
    }
}
