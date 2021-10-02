package by.epam.tc.task1.part2;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {

    @Test
    public void CalculateT001() {
        double leftBorder = -1.1;
        double rightBorder = 34.68987;
        double step = 0.22;
        double realRes;
        double expectedRes = 78.59770149901081;
        realRes = Main.Calculate(leftBorder, rightBorder, step);
        Assert.assertEquals(expectedRes, realRes, 0.00000001);
    }

    @Test
    public void CalculateT002() {
        double leftBorder = 1;
        double rightBorder = -3;
        double step = 1;
        double realRes;
        double expectedRes = -1;
        realRes = Main.Calculate(leftBorder, rightBorder, step);
        Assert.assertEquals(expectedRes, realRes, 0.00000001);
    }
}