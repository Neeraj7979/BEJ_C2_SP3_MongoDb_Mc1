package com.niit.bej.c2_sp3_NoSql_Mc1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE, reason = "Track already present in the database")
public class TrackAlreadyExistException extends Exception {
}
