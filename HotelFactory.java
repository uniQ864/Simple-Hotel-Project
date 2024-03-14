package com.Pentagon.HotelApp;
public class HotelFactory{
    public static HotelDAO createInstance()
    {
        return new HotelDAO_Implemenation();
    }
}


