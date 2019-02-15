import Model.Multiply;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void calc() {
        Multiply multi = new Multiply();

        Double num1 = 15.0;
        Double num2 = 5.0;

        Double expected = 75.0;
        Double product = multi.calc(num1, num2);

        assertEquals(expected, product);
    }

    @Test
    public void calc1() {
        Multiply multi = new Multiply();

        Double num1 = 1d;
        Double num2 = 2d;

        Double expected = 2d;
        Double product = multi.calc(num1, num2);

        assertEquals(expected, product);
    }

    @Test
    public void calc2() {
        Multiply multi = new Multiply();

        Double num1 = -4.0;
        Double num2 = -2.0;

        Double expected = -8d;
        Double product = multi.calc(num1, num2);

        assertNotEquals(expected, product);
    }
}