package learnerlab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    People people;

    Person person;

    @BeforeEach
    void setUp(){
        people = new People();
        person = new Person(1, "John");
    }

    @Test
    void addTest(){
        people.getPersonList().add(person);
        assertTrue(people.getPersonList().contains(person));
    }

    @Test
    void testRemove(){
        people.getPersonList().add(person);
        people.getPersonList().remove(person);
        assertFalse(people.getPersonList().contains(person));
    }

    @Test
    void testFindByID(){

        people.getPersonList().add(person);
        Person actual = people.findById(1);
        assertEquals(person, actual);
    }

}