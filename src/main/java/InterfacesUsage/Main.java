package InterfacesUsage;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Passenger p1 = new Passenger(3, 20, "man1");
        Passenger p2 = new Passenger(1, 50, "man2");
        Passenger p3 = new Passenger(2, 60, "man3");
        Passenger p4 = new Passenger(1, 30, "man4");

        Passenger[] passengers = {p1, p2, p3, p4};
        Arrays.sort(passengers);
        for(Passenger p : passengers)
            System.out.println(p);


        Flight f1 = new Flight(50);
        Flight f2 = new Flight(40);
        Flight f3 = new Flight(60);
        Flight f4 = new Flight(55);
        Flight[] flights = {f1, f2, f3 , f4};
        Arrays.sort(flights);
        for(Flight f : flights)
            System.out.println(f.flightTime);


        Crew c1 = new Crew("pilot");
        Crew c2 = new Crew("stewards");
        Crew[] crews = {c1, c2};
        Flight flight = new Flight(crews , passengers);
        for(Person p : flight){
            System.out.println(p.getName());
        }
        flight.rule();
    }


}
