package generics;

import java.util.ArrayList;
import java.util.List;

public class SavePerson {
    private List<Person> personList = new ArrayList<>();

    public void save(Person person){
        personList.add(person);
    }

    /**  ? means anything extends Person class */
    public void saveAll(List<? extends Person> persons){
        for(Person p: persons)
            personList.add(p);
    }

    /**  T means any Type extends Person class */
    public <T extends Person> void saveAllWithT(List<T> persons){
        for(Person p: persons)
            personList.add(p);
    }

    /**  ? means any Class is extended by Person is accepted  */
    public void saveAllWithSuper(List<? super Person> persons){
        for(Object p: persons)
            personList.add((Person) p);
    }

    public List<Person> load(){
        return personList;
    }
}
