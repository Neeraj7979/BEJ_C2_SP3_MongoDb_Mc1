package com.niit.bej.c2_sp3_NoSql_Mc1.service;

import com.niit.bej.c2_sp3_NoSql_Mc1.domain.Track;
import com.niit.bej.c2_sp3_NoSql_Mc1.exception.TrackAlreadyExistException;


public interface TrackService {
    Track saveTrack(Track track) throws TrackAlreadyExistException;


}
