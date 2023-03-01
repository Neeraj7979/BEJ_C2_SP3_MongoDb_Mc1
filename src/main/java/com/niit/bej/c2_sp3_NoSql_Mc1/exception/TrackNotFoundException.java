package com.niit.bej.c2_sp3_NoSql_Mc1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Track not found in the database")
public class TrackNotFoundException extends Exception {
}
