package com.example.zadanie;


import com.example.zadanie.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public ResponseEntity<ErrorModel> httpMediaTypeNotAcceptableExceptionHandler(HttpMediaTypeNotAcceptableException e) {
        ErrorModel errorModel = new ErrorModel(HttpStatus.NOT_ACCEPTABLE.value(), "this application accepts only JSON response");
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).contentType(MediaType.APPLICATION_JSON).body(errorModel);
    }
}
