package com.niit.bej.c2_sp3_NoSql_Mc1.service;

import com.niit.bej.c2_sp3_NoSql_Mc1.domain.Track;
import com.niit.bej.c2_sp3_NoSql_Mc1.exception.TrackAlreadyExistException;
import com.niit.bej.c2_sp3_NoSql_Mc1.exception.TrackNotFoundException;
import com.niit.bej.c2_sp3_NoSql_Mc1.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService {
    private final TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistException {
        if (trackRepository.findById(track.getTrackId()).isPresent()) throw new TrackAlreadyExistException();
        else return trackRepository.save(track);
    }

    @Override
    public boolean deleteTrackById(Integer id) throws TrackNotFoundException {
        Optional<Track> trackOptional = trackRepository.findById(id);
        return trackOptional.isPresent();
    }

    @Override
    public List<Track> getAllTrack() throws TrackNotFoundException {
        List<Track> allTracks = trackRepository.findAll();
        if (allTracks.isEmpty()) throw new TrackNotFoundException();
        else return allTracks;
    }

    @Override
    public List<Track> getTrackByRatingGreaterThanGivenRating(double rating) throws TrackNotFoundException {
        List<Track> trackByGreaterRating = trackRepository.fetchByRatingGreaterThan(rating);
        if (trackByGreaterRating.isEmpty()) throw new TrackNotFoundException();
        else return trackByGreaterRating;
    }

    @Override
    public List<Track> getAllTrackByArtistName(String artistName) throws TrackNotFoundException {
        List<Track> trackListByArtistName = trackRepository.fetchByArtistName(artistName);
        if (trackListByArtistName.isEmpty()) throw new TrackNotFoundException();
        else return trackListByArtistName;
    }
}
