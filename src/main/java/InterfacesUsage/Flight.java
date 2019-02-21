package InterfacesUsage;

import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Person>, FlightRules {

    public int flightTime;
    private Crew[] crew;
    private Passenger[] passengers;

    private static int PASSENGER_NUMBER =10;

    /**
     * static initialization block
     */
    static {
        PASSENGER_NUMBER +=4;
    }


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
        return new FlightIterator(crew , passengers);
    }

    @Override
    public void rule() {
        System.out.println("Max Number: " + MAX_NUMBER + " && " + "No Smoking area");
    }
}
