package com.niit.bej.c2_sp3_NoSql_Mc1.repository;

import com.niit.bej.c2_sp3_NoSql_Mc1.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TrackRepository extends MongoRepository<Track, Integer> {
   @Query("{'trackRating':?0}")
   List<Track> fetchByRatingGreaterThan(double rating);

   @Query("{'trackArtist.name':?0}")
   List<Track> fetchByArtistName(String artistName);

}
