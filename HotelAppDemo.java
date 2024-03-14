package com.Pentagon.HotelApp;
import java.util.Scanner;

//Utilization Logic
public class HotelAppDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelDTO h = new HotelDTO();
        HotelDAO hImp = HotelFactory.createInstance();
        boolean orderCheck = false;
        int choice = 0;

        while (choice < 7) {
            hImp.menu(h);
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if (choice != 0 && choice < 7) {
                    orderCheck = hImp.takeOrder(h,choice);
                }
                else {
                    System.out.println("Please enter valid Choice.\n");
                }
            }
        System.out.println();
        System.out.println("----------------Thank you for Visiting----------------");
        if(orderCheck){
            hImp.bill(h);
        }
        else {
            System.out.println("You've ordered Nothing...");
        }
        System.out.println("======================================================");
    }
}

