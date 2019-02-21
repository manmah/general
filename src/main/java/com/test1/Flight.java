package com.test1;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    int passengers = 0;
    List<Passenger> list = new ArrayList<>();
    public void addPassengers(Passenger... newlist){
        for(Passenger passenger:newlist){
            passengers += 1;
        }
  //      passengers += newlist.length;
    }
    public int addPassengers(List<Passenger> list){
        this.list.addAll(list);
        passengers = this.list.size();
        return passengers;
    }
    @Override
    public boolean equals(Object o){
        if(super.equals(o))
            return true;
        if(!(o instanceof Flight))
            return false;
        Flight flight = (Flight)o;
        return flight.passengers == passengers;
    }
}
