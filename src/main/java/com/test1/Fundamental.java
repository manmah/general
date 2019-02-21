package com.test1;

public class Fundamental {
    public static void main(String[] args) {
        int b = 6 ;
        int x = b>7 ? 5:8 ;
        if(b == 5 ^ x == 8)
        System.out.println(x);

        Passenger passenger = new Passenger(4,5);
        System.out.println(passenger);
        Passenger passenger1 = new Passenger(50.5);
        System.out.println(passenger1);

        int a = 2 , c = 3 ;
        swap(a, c);
        System.out.println(a + " : " + c);

    }

    private static void swap(int a, int c) {
        int k = a;
        a = c ;
        c = k ;
        System.out.println("inside " + a + " : " + c);
    }
    private static void swap(int a) {
        int k = a;
    }


}
