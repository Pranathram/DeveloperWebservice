package com.example.developer;

public class DeveloperNotFoundException extends RuntimeException{
    public DeveloperNotFoundException(Long id) {
        super("Developer not found with this id: "+id);
    }
}
