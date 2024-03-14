package com.Pentagon.HotelApp;
//Exception class
public class MinQtyException extends Exception{
    public String getMessage(){
        return "Please enter proper Quantity for your Order.\n";
    }
}
