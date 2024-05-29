import org.example.InterestCalculator;
import org.example.Tinhtiennuoc;
import org.junit.Assert;
import org.junit.Test;

public class TestApp {

    @Test
    public void testCalculateInterest() {
        InterestCalculator calculator = new InterestCalculator();
        long output = (long) calculator.calculateInterest(1000000000, 20, false);
        long expected = 54794;
        Assert.assertEquals(expected, output);
    }
    @Test
    public void testTienNuoc(){
        Tinhtiennuoc tinhtiennuoc = new Tinhtiennuoc();
        int output = tinhtiennuoc.Tinhtiennuoc1(452,445);
        int expected = 48083;
        Assert.assertEquals(expected, output);
    }
}
