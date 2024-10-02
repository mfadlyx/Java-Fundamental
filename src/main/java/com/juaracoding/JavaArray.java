package com.juaracoding;

import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {

        //cara 1
        int [] angka = {1,2,3,4,5};
        System.out.println(angka[2]);

        //cara 2
        int [] grades = new int[5];
        grades[0] = 80;
        grades [1] = 81;
        grades [2] = 82;
        grades [3] = 83;
        grades [4] = 84;
        grades [2] = 85;
        System.out.println(grades[4]);
        System.out.println(grades.length);

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("For Each");
        for (int grade : grades){
            System.out.println(grade);
        }

        String [] cars = {"Mazda", "Supra", "BMW", "Mitsubshi"};
        for(String car : cars){
            System.out.println(car.toUpperCase());
        }

        //Array Multidimensi
        int[][] angkaKu = {{1,2,3,4},{5,6,7}};
        System.out.println(angkaKu[1][2]); // baris = 1; kolom = 2;
        System.out.println("Jumlah Baris : "+angkaKu.length);
        System.out.println("Jumlah Kolom baris ke -1 : "+ angkaKu[0].length);
        System.out.println("Jumlah kolom baris ke -2 : "+ angkaKu[1].length);


        for (int i = 0; i <angkaKu.length; i++) {
            for (int j = 0; j <angkaKu[i].length; j++) {
                System.out.println(angkaKu[i][j]);
            }
        }

        //buatkan scanner input data city : Jakarta, Bandung, Surabaya, Bali, Makassar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jumlah data yang akan di input : ");
        int jmlData = scanner.nextInt();

        String[] cities = new String[jmlData];

        for (int i = 0; i < jmlData; i++) {
            System.out.print("Masukan nama kota yang akan di input: ");
            cities[i] = scanner.next();
        }

        System.out.println("Berikut nama kota: ");
        for (String city : cities) {
            System.out.println(city);
        }

        //Menjumlahkan list data harga
        double[] prices = {10000, 50000, 70000, 90000, 100000};
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum+=prices[i];
        }
        System.out.println("Jumlah bayar = " +sum);


        //mencari sebuah data
        String [] kota = {"Jakarta" , "Bandung", "Surabaya", "Bali", "Makassar"};
        System.out.println("Masukan data kota yang ingin dicari = ");
        String search = scanner.next();
        boolean isFound = false;
        int index = 0;
        for (int i = 0; i < kota.length; i++) {
            if (search.equalsIgnoreCase(kota[i])) {
                isFound = true;
                index = i;
            }
        }

        //Data ditemukan, data tidak ditemukan
        if (isFound){
            System.out.println("Data ditemukan pada index ke-" +index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
