package com.juaracoding;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

        //if tunggal
        if (false) {
            System.out.println("Statement");
        }
        System.out.println("Next Statement");

        // 1 3 5 ...
        // 2 4 6 ...
        //if else
        int suhu = 37;

        if (suhu > 36) {
            System.out.println("Cuaca Sangat Panas");
        } else {
            System.out.println("Cuaca Normal");
        }

        int angka = 7;
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah Bilangan Genap");
        } else {
            System.out.println(angka + " adalah Bilangan Ganjil");
        }

        //if majemuk
        String size = "S";
        if (size == "S" || size == "s") {
            System.out.println("Ukuran baju dengan ukuran " + size.toUpperCase() + " harga 50000");
        } else if (size == "M" || size == "m") {
            System.out.println("Ukuran baju dengan ukuran " + size.toUpperCase() + " harga 60000");
        } else if (size == "L" || size == "l") {
            System.out.println("Ukuran baju dengan ukuran " + size.toUpperCase() + " harga 70000");
        } else {
            System.out.println("Mohon maaf, size " + size.toUpperCase() + " yang anda inginkan tidak tersedia");
        }

        //username = admin, password = p4ssw0rd => true AND false (false)
        String inputUsername = "admin";
        String inputPassword = "p4ssw0rd";

        if (inputUsername.equalsIgnoreCase("admin") && inputPassword.equalsIgnoreCase("p4ssw0rd")) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }


        //platnomor ganjil, tanggal ganjil
        //platnomor genap, tangal genap
        int platNomor = 20;
        int tanggal = 15;

        if (platNomor % 2 == 0 && tanggal % 2 == 0) {
            System.out.println("Bisa melewati jalan Soekarno Hatta");
        } else if (platNomor %2 ==1 && tanggal %2 == 0) {
            System.out.println("tidak bisa melewati jalan Soekarno Hatta, dikarenakan plat nomor " + platNomor + " adalah ganjil pada tanggal genap");
        } else  {
            System.out.println("tidak bisa melewati jalan Soekarno Hatta, dikarenakan plat nomor " + platNomor +" adalah genap pada tanggal ganjil");
        }


        // nested if
        //isMember = 10%, isFirstTimeBuyer = 5%, hasCoupon = 2%
        boolean isMember = true;
        boolean isFirstTimeBuyer = false;
        boolean hasCoupon = false;

        double discount = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan total bayar = ");

        double totalAmount = scanner.nextDouble();
        if (totalAmount > 500000){
            if (isMember){
                discount = 0.1;
            }
              else if (isFirstTimeBuyer){
                discount = 0.05;
            } else if (hasCoupon) {
                discount = 0.02;
            }
        }
        System.out.println("Discount = "+ discount*100 +"%");
        System.out.println("Total bayar = Rp. "+(totalAmount-totalAmount*discount));


        //switch case
        System.out.println("Pilih Menu [1-5]: ");
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu){
            case 1:
                System.out.println("Menu ke-1");
                break;
            case 2:
                System.out.println("Menu ke-2");
                break;
            case 3:
                System.out.println("Menu ke-3");
                break;
            case 4:
                System.out.println("Menu ke-4");
                break;
            case 5:
                System.out.println("Menu ke-5");
                break;
        }

        //ternary
        System.out.println("Masukan Nilai : ");
        int nilai = scanner.nextInt();
        String keterangan = nilai >= 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(keterangan);
    }
}
