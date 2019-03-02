import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
Student kevin = new Student("Kevin","A", 12);
    @Test
    void getName() {
        assertEquals("Kevin", kevin.getName());
    }

    @Test
    void getName1() {
        assertNotEquals("Lauren", kevin.getName());
    }

    @Test
    void getGrade() {
        assertEquals("A", kevin.getGrade());
    }

    @Test
    void isEnrolled() {
        assertTrue(kevin.isEnrolled());
    }

    @Test
    void isNotEnrolled() {
        kevin.setEnrolled(false);
        assertFalse(kevin.isEnrolled());
    }

    @Test
    void setEnrolled() {
        assertNotNull(kevin.isEnrolled());
    }

    @Test
    void sameStudent(){
        Student lauren = kevin;
        assertSame(kevin, lauren);
    }

    @Test
    void notSameStudent(){
        Student lauren = new Student("Lauren", "A+", 11);
        assertNotSame(kevin, lauren);
    }
