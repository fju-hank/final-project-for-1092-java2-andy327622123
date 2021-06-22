package com.fju;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        Drink[] drink = new Drink[6];
        drink[0] = new Pocari();
        drink[1] = new Supau();
        drink[2] = new Grapejuice();
        drink[3] = new Uniwater();
        drink[4] = new Orangejuice();
        drink[5] = new Pepsi();

        int inputmoney ;
        int buyid ;
        int buyprice = 0;
        System.out.println("===================================================================\n");


        System.out.println("items: 1. POCARI SWEAT NT30 2. Super Supau NT30  3. Grape Juice NT15\n");
        System.out.println("items: 4. Uni Water NT15    5. Orange Juice NT12 6. Pepsi NT35\n");
        System.out.println("===================================================================\n");
        System.out.print("Don't put banknotes into vending machine! OK?\n");
        System.out.print("Please enter how much did you put in:");
        inputmoney = s.nextInt();

        if (inputmoney <= 0) {
            System.out.println("please try again later\n");

        } else {

            System.out.print("\nPlease enter the number which you want to buy : ");
            buyid = s.nextInt();

            for (Drink drinks : drink) {
                if (drinks.id == buyid) {
                    buyprice = drinks.price;
                }
            }
            if ((inputmoney - buyprice) >= 0) {
                inputmoney -= buyprice;
            } else {
                System.out.println("your coins didn't enough");
            }
            Coins coins = new Coins();
            coins.setMoney(inputmoney);
            coins.getMoney();


        }
    }
}


