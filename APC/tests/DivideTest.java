import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTest {

    @Test
    public void calc() {
        Divide div = new Divide();

        Double num1 = 15.0;
        Double num2 = 5.0;

        Double expected = 3.0;
        Double quotient = div.calc(num1, num2);

        assertEquals(expected, quotient);
    }

    @Test
    public void calc1() {
        Divide div = new Divide();

        Double num1 = 1d;
        Double num2 = 2d;

        Double expected = .5;
        Double quotient = div.calc(num1, num2);

        assertEquals(expected, quotient);
    }

    @Test
    public void calc2() {
        Divide div = new Divide();

        Double num1 = -4.0;
        Double num2 = -2.0;

        Double expected = -2d;
        Double quotient = div.calc(num1, num2);

        assertNotEquals(expected, quotient);
    }
}