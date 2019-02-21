package com.test1;

import java.util.ArrayList;
import java.util.List;

public class Overloading {
    public static void main(String[] args) {
        Passenger man1 = new Passenger(50);
        Passenger man2 = new Passenger(40,1);
        Passenger man3 = new Passenger(30);
        ArrayList<Passenger> list = new ArrayList<>();
        list.add(man1);list.add(man2);list.add(man3);

        Flight flight = new Flight();
        Flight flight2 = new Flight();
        flight.addPassengers(list);
        System.out.println(flight.passengers);

        Flight flight1 = new Passenger(50);
        ((Passenger) flight1).getFeePerBag();

        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Object o = new Flight();
        System.out.println(o.toString());
        if(flight2.equals(flight1)){
            System.out.println("true");
        }
    }
}
