package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        // arrays price & quantity
        float[] p;//price
        int[] q;//quantity

        //memory for arrays
        p = new float[5];
        q = new int[5];


        //processing input:
        for(int i=1;i<4;i++){//price 1 to 3
            Scanner price = new Scanner(System.in);
            System.out.println("What is the price of item "+i);
            float pr = price.nextFloat();

            p[i]=pr;
            System.out.println(p[i]);

            Scanner quantity = new Scanner(System.in);
            System.out.println("What is the quantity of item "+i);
            String qu = quantity.nextLine();
            int QUANTITY = Integer.parseInt(qu);
            q[i]=QUANTITY;
            System.out.println(q[i]);

        }

        //computing with input

        float subtotal=0;
        for(int k=1;k<4;k++){subtotal = subtotal + p[k] * q[k];}
        System.out.println(subtotal);
        float taxamount=(float).055;
        float tax = (subtotal*taxamount);
        float total = tax+subtotal;

        //outputting

        System.out.printf("subtotal: %.2f\n",subtotal);
        System.out.printf("tax: %.2f\n",tax);
        System.out.printf("total: %.2f",total);




    }
}
