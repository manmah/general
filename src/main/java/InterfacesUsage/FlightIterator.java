package InterfacesUsage;

import java.util.Iterator;

public class FlightIterator implements Iterator<Person> {

    private Passenger[] passengers;
    private Crew[] crew;
    private int index = 0;

    public FlightIterator( Crew[] crew , Passenger[] passengers) {
        this.passengers = passengers;
        this.crew = crew;
    }

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
