package com.juaracoding;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {
        //for
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("Next statement");

        System.out.println("Bilangan Ganjil :");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");
        System.out.println("Bilangan Genap :");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Metode Operator Assigment
        System.out.println(" ");
        System.out.println("Bilangan Ganjil :");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("Bilangan Genap : ");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + " ");
            i++;
        }

        //nested for
        System.out.println(" ");
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //*
        //**
        //***
        System.out.println(" ");
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //***
        //**
        //*
        System.out.println(" ");
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //while
        int x = 0;
        while (x < 0) {
            System.out.print(x);
            x++;
        }
        System.out.println(" ");
        System.out.println("Next Statement");


        //do while
        int y = 0;
        do {
            System.out.print(y);
            y++;
        } while (y < 0);
        System.out.println();

        //break
        while (x < 6) {
            System.out.println("Looping ke-" + x);
            x++;
            if (x == 3) break;
        }

//        //continue
//        while (x < 6) {
//            if (x == 3) {
//                x++;
//                continue;
//            }
//            System.out.println("looping ke-"+x);
//            x++;

        //input angka berapapun, tapi ketika input angka 0 keluar looping
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input Angka : ");
            int number = scanner.nextInt();
            System.out.println(number);
            if (number == 0) break;
        }

    }
}
