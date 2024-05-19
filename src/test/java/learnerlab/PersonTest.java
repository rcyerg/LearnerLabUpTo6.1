package learnerlab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp(){
        person = new Person(18408201, "Bill Gates");
    }

    @Test
    void constructorTest(){

        assertEquals(18408201, person.getId());

        assertEquals("Bill Gates", person.getName());
    }

    @Test
    void setterTest(){
        person.setName("Tom Smith");

        assertEquals("Tom Smith", person.getName());
    }
}