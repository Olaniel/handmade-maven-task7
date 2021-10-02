package by.epam.tc.task1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.epam.tc.task1.part2.TestCalculate;
import by.epam.tc.task1.part2.TestIsRightBorderValid;
import by.epam.tc.task1.part2.TestIsStepValid;

@Suite.SuiteClasses({ TestCalculate.class,TestIsRightBorderValid.class, TestIsStepValid.class })
@RunWith(Suite.class)
public class handmade_maven_task7Suite {
}