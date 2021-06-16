package com.fju;

public class Coins {private int one;
    private int five;
    private int ten;
    private int money;
    public void setMoney(int n){
        money = n;
        ten= money /10;
        five = (money-ten*10)/5;
        one = money-(ten*10+five*5);

    }
    public void getMoney(){
        System.out.println("return "+ten+" ten dollars coins");
        System.out.println("return "+five+" five dollars coins");
        System.out.println("return "+one+" one dollar coins");
        System.out.println("return total NT"+money);
    }
}
