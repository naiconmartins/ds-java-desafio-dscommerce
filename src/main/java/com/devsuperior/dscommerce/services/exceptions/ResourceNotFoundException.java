package com.devsuperior.dscommerce.services.exceptions;

// RuntimeException não exige o uso do try catch. Já a Exception exige
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
