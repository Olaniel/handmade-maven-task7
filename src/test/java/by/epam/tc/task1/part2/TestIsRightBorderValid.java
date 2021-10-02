package by.epam.tc.task1.part2;

import org.junit.Assert;
import org.junit.Test;

public class TestIsRightBorderValid {
    @Test
    public void IsRightBorderValidT001() {
        double leftBorder = -1.1;
        double rightBorder = 34.68987;
        boolean realRes;
        boolean expectedRes = true;
        realRes = Main.IsRightBorderValid(leftBorder, rightBorder);
        Assert.assertEquals(expectedRes, realRes);
    }

    @Test
    public void IsRightBorderValidT002() {
        double leftBorder = 5;
        double rightBorder = -8.65;
        boolean realRes;
        boolean expectedRes = false;
        realRes = Main.IsRightBorderValid(leftBorder, rightBorder);
        Assert.assertEquals(expectedRes, realRes);
    }
}