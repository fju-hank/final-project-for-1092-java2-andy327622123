package com.fju;

public class Coins {private int one;
    private int five;
    private int ten;
    private int total;
    public void setMoney(int inputmoney){
        total = inputmoney;
        ten= total /10;
        five = (total-ten*10)/5;
        one = total-(ten*10+five*5);

    }
    public void getMoney(){
        System.out.println("return "+ten+" ten dollars coins");
        System.out.println("return "+five+" five dollars coins");
        System.out.println("return "+one+" one dollar coins");
        System.out.println("return total NT"+total);
    }
}
