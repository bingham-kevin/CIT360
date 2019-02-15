import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    @Test
    public void calc() {
        Add add = new Add();

        Double num1 = 15.0;
        Double num2 = 5.0;

        Double expected = 20.0;
        Double sum = add.calc(num1, num2);

        assertEquals(expected, sum);
    }ds

    @Test
    public void calc1() {
        Add add = new Add();

        Double num1 = 1d;
        Double num2 = 2d;

        Double expected = 3d;
        Double sum = add.calc(num1, num2);

        assertEquals(expected, sum);
    }

    @Test
    public void calc2() {
        Add add = new Add();

        Double num1 = -4.0;
        Double num2 = -2.0;

        Double expected = -2d;
        Double sum = add.calc(num1, num2);

        assertNotEquals(expected, sum);
    }
}