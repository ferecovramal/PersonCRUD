import java.util.List;

public class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Person() {
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Person getPersonByAge(int age, List<Person> personList) {
        for (Person person : personList) {
            if (person.getAge() == age) {
                return person;
            }
        }
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPersonById(long id, List<Person> personList) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printNamesContaining(String letters, List<Person> personList) {
        boolean found = false;
        for (Person person : personList) {
            String name = person.getName().toLowerCase();
            if (name.startsWith(letters.toLowerCase())) {
                System.out.println("ID: " + person.getId());
                System.out.println("Name:" + person.getName());
                System.out.println("Age:" + person.getAge());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No names starting with letters '" + letters + "' found.");
        }
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public void addString(List<Person> personList, int id, String name, int age) {
        personList.add(new Person(id, name, age));
    }

    public void updatePerson(List<Person> personList,int id, String newName, int newAge) {
        for (Person person : personList) {
            if (person.getId() == id) {
                person.setName(newName);
                person.setAge(newAge);
                return;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
    }
    public void deletePerson(List<Person> personList, int id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                personList.remove(i);
                System.out.println("Person with ID " + id + " removed.");
                return;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
    }

}