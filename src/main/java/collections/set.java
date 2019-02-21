package collections;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Person p1 = new Person("p1", "worker1");
        Person p2 = new Person("p2", "worker2");
        Person p3 = new Person("p3", "worker3");


        Set<Person> setList = new HashSet<>();
        setList.add(p2);setList.add(p1);setList.add(p3);
        setList.forEach(m -> System.out.println("1- " + m.job + ":" + m.name));

        Iterator<Person> personIterator = setList.iterator();
        while ( personIterator.hasNext()){
            Person person = personIterator.next();
            if(person.name.equals("p1"))
                personIterator.remove();
        }

        setList.forEach(m -> System.out.println("2- "+ m.job + ":" + m.name));
        setList.removeIf(m -> m.name.equals("p2"));
        setList.forEach(m -> System.out.println("3- "+ m.job + ":" + m.name));



        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        Collections.sort(list);

        list.forEach(m -> System.out.println(m.job));

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(p1);treeSet.add(p2);treeSet.add(p3);
        treeSet.forEach(m -> System.out.println(m.job));


    }
}
