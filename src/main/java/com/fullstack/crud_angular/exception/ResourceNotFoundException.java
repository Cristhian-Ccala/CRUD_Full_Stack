package com.fullstack.crud_angular.exception;

import org.hibernate.mapping.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class ResourceNotFoundException extends RuntimeException {
    private String message;
    public ResourceNotFoundException(String message){
        super(message);
        this.message = message;

    }
}
