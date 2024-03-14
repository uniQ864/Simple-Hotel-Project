package com.Pentagon.HotelApp;
//DAO
public interface HotelDAO{
    void menu(HotelDTO hd);
    void bill(HotelDTO hd);
    boolean takeOrder(HotelDTO hd,int ch);
}
