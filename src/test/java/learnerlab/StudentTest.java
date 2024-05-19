package learnerlab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp(){
        student = new Student(1800000, "John Jimmy", 0.0);
    }

    @Test
    void implementationTest(){

        assertInstanceOf(Learner.class, student);
    }

    @Test
    void inheritanceTest(){
        assertInstanceOf(Person.class, student);
    }

    @Test
    void learnTest(){
        student.learn(5.0);
        assertEquals(5.0, student.getTotalStudyTime());
    }
}