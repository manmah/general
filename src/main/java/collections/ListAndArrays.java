package collections;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ListAndArrays {
    public static void main(String[] args) {
        Person p1 = new Person("p1", "worker1");
        Person p2 = new Person("p4", "worker2");
        Person p3 = new Person("p3", "worker3");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        Collections.sort(list,Person.ByName);
        for(Person p : list) System.out.println("1-  " + p.name);
        list.clear();
        Collections.addAll(list , p1, p2, p3);
        System.out.println("Max : "+ Collections.max(list).job);
        for(Person p : list) System.out.println("1-2  " + p.name);

        list.remove(p2);
        for(Person p : list) System.out.println("2-  " +p.name);

        /**  Using Collections java 8 methods with Lmabda    */
        list.removeIf(m -> m.name =="p3");
        list.forEach(m -> System.out.println("3-  " +m.name));

        /** change List to Array  */
        Person[] array = new Person[list.size()];
        array =  list.toArray(array);
        for(Person p : array)
            System.out.println("4-  " +p.name);

        /** change Array to Collection type  */
        Collection<Person> collection = Arrays.asList(array);
        collection.forEach(m -> System.out.println(m.job));


    }
}
