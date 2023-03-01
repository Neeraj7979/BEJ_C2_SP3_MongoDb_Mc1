package com.niit.bej.c2_sp3_NoSql_Mc1.controller;

import com.niit.bej.c2_sp3_NoSql_Mc1.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackController {
    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }
}
