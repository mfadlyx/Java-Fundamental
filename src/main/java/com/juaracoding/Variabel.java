package com.juaracoding;

public class Variabel {
    public static void main(String[] args) {

        //Tipe Penulisan variabel
        //camelCase - camelCase, CamelCase
        //snake_case - snake_case

        //Data Type - numeric
        //(Bilangan Bulat)
        byte countCart = 100;
        short stock = 10000;
        int price = 1500000;
        long saldo = 300000000L;
        //(Bilanan Desimal)
        float pi = 3.14f;
        double salary = 2500000.75;

        //Data Type - character
        char blockRoom = 'A';

        //Data Type - boolean
        boolean isResult = false;

        //Data Type - Object
        String path = "E:\\Maven\\apache-maven-3.9.9";
        System.out.println(path);

        //buat tampilan ke console user profile
        String fullName = "Muhammad Fadly";
        byte age = 22;
        String city = "Jakarta";
        boolean isGraduated = true;

        System.out.println("User Profile");
        System.out.println("Nama Lengkap : " + fullName);
        System.out.println("Umur : " + age);
        System.out.println("Asal Kota : " + city);
        System.out.println("Sudah Lulus Kuliah ? : " + isGraduated);

        //automatic casting
        short data1 = 123;
        double dataDouble = data1;
        System.out.println(dataDouble);

        String club = "Manchester United";
        club = "Manchester City";
        System.out.println(club);

        //manual casting
        long data = 9223334684345355000L;
        int dataInt = (int) data;
        System.out.println(dataInt);


    }
}