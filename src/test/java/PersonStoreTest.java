import generics.Employee;
import generics.Partner;
import generics.Person;
import generics.SavePerson;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonStoreTest {

    private Person per1= new Person("person1");
    private Person per2= new Employee("person2");
    private Person per3= new Partner("person3");
    private Partner par1 = new Partner("par1");
    private Employee emp1 = new Employee("emp1");

    private SavePerson saver = new SavePerson();

    @Test
    public void savePerson(){

        List<Partner> partners= new ArrayList<>();
        partners.add(par1);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);

        saver.saveAll(partners);
        saver.saveAll(employees);
        Assert.assertTrue(saver.load().contains(par1));
        Assert.assertTrue(saver.load().contains(emp1));
    }
}
