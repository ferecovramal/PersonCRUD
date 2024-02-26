import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Ramal", 18));
        personList.add(new Person(2, "Azer", 19));
        personList.add(new Person(3, "Yawar", 20));
        personList.add(new Person(4, "Mehdi", 22));
        personList.add(new Person(5, "Araz", 24));
        personList.add(new Person(6, "Elmir", 28));
        personList.add(new Person(7, "Daryl", 27));

        Person person = new Person();
        Person personById = person.getPersonById(7, personList);
        if (personById != null) {
            System.out.println("Person with ID: " + personById.getName());
        } else {
            System.out.println("Person with ID not found.");
        }


        Person personWithAge = person.getPersonByAge(22, personList);
        if (personWithAge != null) {
            System.out.println("Person with age: " + personWithAge.getName());
        } else {
            System.out.println("Person with age not found.");
        }

        String letters = "Ram";
        System.out.println("Names containing letters '" + letters + "':");
        personWithAge.printNamesContaining(letters, personList);

        person.addString(personList, 8, "Rick", 35);
        System.out.println("Updated list:");
        for (Person p : personList) {
            System.out.println("ID: " + p.getId());
            System.out.println("Name:" + p.getName());
            System.out.println("Age:" + p.getAge());
        }

        person.updatePerson(personList, 2, "Mamed", 19);
        System.out.println("Updated list after modification:");
        for (Person p : personList) {
            System.out.println("Id:" + p.getId());
            System.out.println("Name:" + p.getName());
            System.out.println("Age:" + p.getAge());

        }

        person.deletePerson(personList, 9);
        System.out.println("Updated list after deletion:");
        for (Person p : personList) {
            System.out.println("ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());

        }
    }
}




