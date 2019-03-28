package mypack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MaxTest {

    mypack.Max m = new mypack.Max();

    @Test
    public void getMaxABiggest() {
        int res = m.getMax(3, 2);
        Assertions.assertEquals(res, 3);
    }

    @Test
    public void getMaxEquals() {
        Assertions.assertEquals(m.getMax(3, 3), 3);
    }

    @Test
    public void isLessTrue() {
        Assertions.assertTrue(m.isLess(2,3));
    }

    @Test
    public void isLessFalse() {
        Assertions.assertFalse(m.isLess(3,3));
    }

}
