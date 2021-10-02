package by.epam.tc.task1.part2;

import org.junit.Assert;
import org.junit.Test;

public class TestIsStepValid {
    @Test
    public void IsStepValidT001() {
        double step = 0.123;
        boolean realRes;
        boolean expectedRes = true;
        realRes = Main.IsStepValid(step);
        Assert.assertEquals(expectedRes, realRes);
    }

    @Test
    public void IsStepValidT002() {
        double step = -8.65;
        boolean realRes;
        boolean expectedRes = false;
        realRes = Main.IsStepValid(step);
        Assert.assertEquals(expectedRes, realRes);
    }
}