package com.Pentagon.HotelApp;
class HotelDTO{
    String item[]={"Idli  ","Vada  ","Dosa  ","Paddu ","Tea   ","Coffee"};
    int order[][] = new int[6][2];
    HotelDTO(){
        order[0][0] = 30;
        order[1][0] = 20;
        order[2][0] = 50;
        order[3][0] = 30;
        order[4][0] = 12;
        order[5][0] = 12;
    }

    public int getPrice(int i){
        return order[i][0];
    }
    public int getQty(int i){
        return order[i][1];
    }
    public void setQty(int i,int qty){
        order[i][1] = qty;
    }

}
