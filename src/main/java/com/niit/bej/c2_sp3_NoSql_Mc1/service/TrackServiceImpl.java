package com.niit.bej.c2_sp3_NoSql_Mc1.service;

import com.niit.bej.c2_sp3_NoSql_Mc1.domain.Track;
import com.niit.bej.c2_sp3_NoSql_Mc1.exception.TrackAlreadyExistException;
import com.niit.bej.c2_sp3_NoSql_Mc1.exception.TrackNotFoundException;
import com.niit.bej.c2_sp3_NoSql_Mc1.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {
    private final TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistException {
        return null;
    }

    @Override
    public boolean deleteTrackById(Integer id) throws TrackNotFoundException {
        return false;
    }

    @Override
    public List<Track> getAllTrack() throws TrackNotFoundException {
        return null;
    }

    @Override
    public List<Track> getTrackByRatingGreaterThanGivenRating(double rating) throws TrackNotFoundException {
        return null;
    }

    @Override
    public List<Track> getAllTrackByArtistName(String artistName) throws TrackNotFoundException {
        return null;
    }
}
