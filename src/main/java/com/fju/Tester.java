package com.fju;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args){


            Scanner s = new Scanner(System.in);
            Drink[] drink = new Drink[6];
            drink[0] = new Pocari();
            drink[1] = new Supau();
            drink[2] = new Grapejuice();
            drink[3] = new Uniwater();
            drink[4] = new Orangejuice();
            drink[5] = new Pepsi();
            int money = 0;
            int a = 0;
            System.out.println("===================================================================\n");


            System.out.println("items:1. POCARI SWEAT NT30 2. Super Supau NT30 3. Grape Juice NT15\n");
            System.out.println("items:4. Uni Water NT15  5. Orange Juice NT12 6. Pepsi NT35\n");
            System.out.println("===================================================================\n");
            System.out.print("Don't put banknotes into vending machine! OK?\n");
            System.out.print("Please enter how much did you put in:");
            int n = s.nextInt();

            money = n;
            System.out.print("\nPlease enter the number which you want to buy : ");
            int n1 = s.nextInt();

            for (Drink drinks : drink) {
                if (drinks.id == n1) {
                    a = drinks.price;
                }
            }
            if ((n - a) >= 0) {
                money -= a;
            } else {
                System.out.println("your coins didn't enough");
            }
            Coins c = new Coins();
            c.setMoney(money);
            c.getMoney();


    }
}


