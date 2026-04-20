package com.naman.taskflow.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ResponseStatus(HttpStatus.NOT_FOUND) → tells Spring that whenever this 
 * exception is thrown, it should automatically send a 404 Not Found status code.
 * 
 * We extend RuntimeException because we want to throw this without 
 * having to declare "throws" in every method signature.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String message) {
        super(message);
    }
}
