package com.niit.bej.c2_sp3_NoSql_Mc1.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Music {
    @Id
    private int trackId;
    private String trackName;
    private double trackRating;
    private Artist artist;

}
