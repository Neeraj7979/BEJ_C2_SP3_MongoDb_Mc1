package com.niit.bej.c2_sp3_NoSql_Mc1.service;

import com.niit.bej.c2_sp3_NoSql_Mc1.domain.Track;
import com.niit.bej.c2_sp3_NoSql_Mc1.exception.TrackAlreadyExistException;
import com.niit.bej.c2_sp3_NoSql_Mc1.exception.TrackNotFoundException;

import java.util.List;


public interface TrackService {
    Track saveTrack(Track track) throws TrackAlreadyExistException;

    boolean deleteTrackById(Integer id) throws TrackNotFoundException;

    List<Track> getAllTrack() throws TrackNotFoundException;

    List<Track> getTrackByRatingGreaterThanGivenRating(double rating) throws TrackNotFoundException;

    List<Track> getAllTrackByArtistName(String artistName) throws TrackNotFoundException;


}
