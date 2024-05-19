package learnerlab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    Instructor instructor;

    Student student1;

    Student student2;

    Student student3;

    Learner[] learners;

    @BeforeEach
    void setUp(){
        instructor = new Instructor(1, "Mr. Instructor");
        student1 = new Student(2, "Bobby", 0.0);
        student2 = new Student(3, "Timmy", 0.0);
        student3 = new Student(4, "Johnny", 0.0);
        learners = new Learner[]{student1, student2, student3};
    }

    @Test
    void implementationTest(){
        assertInstanceOf(Teacher.class, instructor);
    }

    @Test
    void inheritanceTest(){
        assertInstanceOf(Person.class, instructor);
    }

    @Test
    void teachTest(){
        instructor.teach(student1, 8.0);

        assertEquals(8.0, student1.getTotalStudyTime());
    }

    @Test
    void lectureTest(){
        instructor.lecture(learners, 9.0);

        assertEquals(3.0, student1.getTotalStudyTime());
        assertEquals(3.0, student2.getTotalStudyTime());
        assertEquals(3.0, student3.getTotalStudyTime());
    }
}