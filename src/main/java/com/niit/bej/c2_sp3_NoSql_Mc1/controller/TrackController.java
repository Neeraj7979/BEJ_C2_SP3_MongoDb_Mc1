package com.niit.bej.c2_sp3_NoSql_Mc1.controller;

import com.niit.bej.c2_sp3_NoSql_Mc1.domain.Track;
import com.niit.bej.c2_sp3_NoSql_Mc1.exception.TrackAlreadyExistException;
import com.niit.bej.c2_sp3_NoSql_Mc1.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackController {
    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping("/saveTrack")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) {
        try {
            Track saveNewTrack = trackService.saveTrack(track);
            return new ResponseEntity<>(trackService, HttpStatus.ACCEPTED);
        } catch (TrackAlreadyExistException exception) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
