import model.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Person person1 = new Person.Builder("Colia", "Havriliuk").setGender(Person.Gender.male).setBirthdate(LocalDate.of(2001, 5, 22)).build();
        Person person2 = new Person.Builder("Alisia", "Havriliuk").setGender(Person.Gender.female).setBirthdate(LocalDate.of(2001, 7, 16)).build();
        Person person3 = new Person.Builder("Artyr", "Havriliuk").setGender(Person.Gender.child).setBirthdate(LocalDate.of(2012, 1, 1)).build();
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        House house1 = new House.Builder("Chernivtsi").setArea((float) 30.0).setFlours(3).setYear(2010).setPersons(people).build();
        
        System.out.println(house1);
    }
}
