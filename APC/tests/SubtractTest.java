import Model.Subtract;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractTest {

    @Test
    public void calc() {
        Subtract subtract = new Subtract();

        Double num1 = 15.0;
        Double num2 = 5.0;

        Double expected = 10.0;
        Double diff = subtract.calc(num1, num2);

        assertEquals(expected, diff);
    }

    @Test
    public void calc1() {
        Subtract subtract = new Subtract();

        Double num1 = 1d;
        Double num2 = 2d;

        Double expected = -1d;
        Double diff = subtract.calc(num1, num2);

        assertEquals(expected, diff);
    }

    @Test
    public void calc2() {
        Subtract subtract = new Subtract();

        Double num1 = -4.0;
        Double num2 = -2.0;

        Double expected = -6d;
        Double diff = subtract.calc(num1, num2);

        assertNotEquals(expected, diff);
    }

}