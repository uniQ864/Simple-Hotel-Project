package com.Pentagon.HotelApp;
import java.util.Scanner;
public class HotelDAO_Implemenation implements HotelDAO {
    public void menu(HotelDTO hd) {
        System.out.println("====WELCOME TO HOTEL PENTAGON====");
        System.out.println("Sl.No        Item        Price");
        System.out.println("=================================");
        int slNo = 0;
        for (int i = 0; i < 6; i++) {
            slNo++;
            System.out.println(slNo + "            " + hd.item[i] + "       " + hd.getPrice(i) + "Rs/-");
        }
        System.out.println("Press '7' to get bill");
        System.out.println("=================================\n");
    }

    public boolean takeOrder(HotelDTO hd, int ch) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Quantity in Numbers: ");
        int qty = scan.nextInt();
        try {
            if (qty > 0) {
                hd.setQty(ch - 1, qty);
                return true;
            } else {
                throw new MinQtyException();
            }
        } catch (MinQtyException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void bill(HotelDTO hd) {
        int slNo = 0;
        System.out.println("Sl.No    Items      Quantity       Price       Total");
        for (int i = 0; i < 6; i++) {
            if (hd.getQty(i) > 0) {
                slNo++;
                System.out.println("  " + slNo + "      " + hd.item[i] + "        " + hd.getQty(i) +
                        "            " + hd.getPrice(i) + "         " + hd.getQty(i) * hd.getPrice(i) + "Rs/-");
            }
        }
        System.out.println("======================================================\n");
        float gst = 0.18f ,total;
        System.out.println("---------------------Final Bill-----------------------");
        for (int i = 0; i < 6; i++) {
            if (hd.getQty(i) > 0) {
                total = hd.getQty(i) * hd.getPrice(i);
                System.out.print("Final Cost = "+total+"Rs + ");
                System.out.print(total * gst +"Rs (Incl.18% GST)");
                total = total + total * gst;
                System.out.println("-->"+total+"Rs/-");

            }
        }
    }
}