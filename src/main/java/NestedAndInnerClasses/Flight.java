package NestedAndInnerClasses;

import InterfacesUsage.FlightRules;

import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Person>, FlightRules {

    public int flightTime;
    private Crew[] crew;
    private Passenger[] passengers;

    public Flight(Crew[] crew, Passenger[] passengers) {
        this.crew = crew;
        this.passengers = passengers;
    }

    public Flight(int flightTime) {
        this.flightTime = flightTime;

    }

    @Override
    public int compareTo(Flight f) {
        return flightTime - f.flightTime;

    }

    @Override
    public Iterator<Person> iterator() {
        return new FlightIterator();
    }

    @Override
    public void rule() {
        System.out.println("Max Number: " + MAX_NUMBER + " && " + "No Smoking area");
    }


/**
 * Using of Inner Class
 */
    private class FlightIterator implements Iterator<Person> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return (index < (passengers.length + crew.length));
        }

        @Override
        public Person next() {
            Person p = index<crew.length ? crew[index] : passengers[index - crew.length];
            index++;
            return p;
        }
    }

}
