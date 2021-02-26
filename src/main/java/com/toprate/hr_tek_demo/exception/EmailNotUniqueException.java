package com.toprate.hr_tek_demo.exception;

/**
 * Created by IntelliJ IDEA.
 * User: namnv
 * Date: 03:00 26/02/2021
 */
public class EmailNotUniqueException extends Exception {

    public EmailNotUniqueException(String message) {
        super(message);
    }
}