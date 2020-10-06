import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    List<Person> personList = new ArrayList<Person>();

    public People() {
    }

    public void add(Person person) {
        personList.add(person);

    }

    public Person findById(Long id) {
        for (Person person : personList) {
            if (person.getNameId() == id) ;
            return person;
        }
        return null;
    }

    public boolean contains(Person person) {
        if (personList.contains(person)) {
            return true;
        } else {
            return false;
        }
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeById(Long id) {
        for (Person person : personList) {
            if (person.getNameId() == id) ;
            personList.remove(id);
        }

    }


    public void removeAll() {
        personList.removeAll(personList);
    }

    public int count() {
        return personList.size();
    }
    public Person[] toArray(){
        return (Person[]) personList.toArray();
    }
    public Iterator iterator(){
        return personList.iterator();

    }
}
