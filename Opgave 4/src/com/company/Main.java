package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //4.a
        System.out.println("\nDivided by 2: ");
        for (int i=1; i<=100; i++) {
            if (i%2==0)
                System.out.print(i + " ");
        }
        System.out.println("\n");

        //4.b and 4.c
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        System.out.println(arr[randomNumber]);

        //4.d
        numbers(6);

    }
    public static void numbers(int n) {
        if(n < 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            n--;
            numbers(n);

        }
    }

}