package ExerciseOne;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class MaximTest {

    private Maxim maxim;
    private int expected;
    private int firstParameter;
    private int secondParameter;

    public MaximTest(int expected, int firstParameter, int secondParameter) {
        this.expected = expected;
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    @Before
    public void setup() {
        maxim = new Maxim();
        System.out.println(" test ... ");
    }
@Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {3, 11, 8},

        });
    }


    @Test
    public void getMax() {
        maxim = new Maxim();
        Assertions.assertEquals(expected, maxim.getMax (firstParameter, secondParameter));
    }

}
