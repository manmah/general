package collections;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    String name,job ;
    public static final Comparator<Person> ByName = Comparator.comparing(Person::getName).reversed();

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }


    @Override
    public boolean equals(Object o){
        Person p = (Person)o;
        return job.equalsIgnoreCase(p.job);
    }

    @Override
    public int compareTo(Person p) {
        return job.compareToIgnoreCase(p.job);
    }
}
