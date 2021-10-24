package com.company;

import org.apache.log4j.Logger;

public class CustomException extends ArithmeticException{
    private final Logger log = Logger.getLogger(CustomException.class);

    public CustomException() {
        log.info("CustomException is working");
    }

    public CustomException(String message) {
        super(message);
        log.info("CustomException is working: " + message);
    }
}
