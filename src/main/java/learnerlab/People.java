package learnerlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    List<Person> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList(){
        return this.personList;
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (Person person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }
    public void remove(long id){
        personList.removeIf(person -> person.getId() == id);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return this.getPersonList().size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return this.getPersonList().iterator();
    }
}
