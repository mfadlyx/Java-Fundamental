package com.juaracoding;

public class Operator {
    public static void main(String[] args) {

        //aritmatik
        double result = 5.0/2.0;
        System.out.println(result);

        int modulus = 11 % 3;
        System.out.println(modulus);

        //prefix
        int x = 2;
        int hasil1= 10 * x++;
        System.out.println(hasil1);

        //suffix
        int z = 2;
        int hasil2 = 10 * ++z;
        System.out.println(hasil2);

        //asigment
        int a = 10;
        int b = 12;
        a += b;
        System.out.println(a);

        //relational
        boolean isResult = 2 >= 5;
        System.out.println(isResult);

        //bitwise
        int bitwise = 10 | 12;
        // 10 = 1010
        // 12 = 1100 |
        // 14 = 1110
        System.out.println(bitwise);



    }
}
