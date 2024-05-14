package com.exceptions.customexception;

public class SpeedLimitExceedException extends Exception{
    public SpeedLimitExceedException(String message){
        super(message);
    }
}
