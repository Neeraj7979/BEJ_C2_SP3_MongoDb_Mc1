package com.niit.bej.c2_sp3_NoSql_Mc1.repository;

import com.niit.bej.c2_sp3_NoSql_Mc1.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackRepository extends MongoRepository<Track, Integer> {
}
