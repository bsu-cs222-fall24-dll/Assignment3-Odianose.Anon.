package bsu.edu.cs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeapYearCalculatorTest {
    @Test
    public void test2024IsLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2024);
        Assertions.assertTrue(result);
    }
    @Test
    public void test2025IsNotLeapYear() {
        bsu.edu.cs.LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2025);
        Assertions.assertFalse(result);
    }
    @Test
    public void test2040IsLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2040);
        Assertions.assertTrue(result);
    }
    @Test
    public void test2027IsNotLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2027);
        Assertions.assertFalse(result);
    }
    @Test
    public void test2000IsLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2000);
        Assertions.assertTrue(result);
    }
    @Test
    public void test1900IsNotLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(1900);
        Assertions.assertFalse(result);
    }
    @Test
    public void test2028IsLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2028);
        Assertions.assertTrue(result);
    }
}
