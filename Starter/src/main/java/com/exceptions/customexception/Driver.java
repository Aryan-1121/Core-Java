package com.exceptions.customexception;

public class Driver {
    public static void main(String[] args) {
        int speed =950;

        try{
            if(speed > 60){
                throw new SpeedLimitExceedException("spped limit exceeded 60");
            }
            else {
                System.out.println("your speed is " + speed);
            }
        }catch(Exception e){
            System.out.println(e);
        }


    }
}
