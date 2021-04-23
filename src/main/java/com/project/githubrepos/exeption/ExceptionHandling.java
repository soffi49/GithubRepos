package com.project.githubrepos.exeption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.io.FileNotFoundException;

@ControllerAdvice
public class ExceptionHandling{
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandling.class);

    @ExceptionHandler(value = { FileNotFoundException.class })
    public ResponseEntity<Object> handleInvalidInputException(FileNotFoundException ex) {
        logger.error("Such user does not exist",ex.getMessage());
        return new ResponseEntity<>("Such user does not exist",HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = { ConstraintViolationException.class })
    public ResponseEntity<Object> handleInvalidInputException(ConstraintViolationException ex) {
        logger.error("The given name is incorrect.",ex.getMessage());
        return new ResponseEntity<>("Incorrect username: Username may only contain alphanumeric characters " +
                "or single hyphens, and cannot begin or end with a hyphen.",HttpStatus.BAD_REQUEST);
    }
}
