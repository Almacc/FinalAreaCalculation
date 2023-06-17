import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    @Test
    public void testCalculateCircleArea() {
        double radius = 5.0;
        double expectedArea = 78.53981633974483;
        double actualArea = Main.calculateCircleArea(radius);
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testCalculateSquareArea() {
        double sideLength = 7.0;
        double expectedArea = 49.0;
        double actualArea = Main.calculateSquareArea(sideLength);
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testCalculateRectangleArea() {
        double length = 4.0;
        double width = 6.0;
        double expectedArea = 24.0;
        double actualArea = Main.calculateRectangleArea(length, width);
        Assertions.assertEquals(expectedArea, actualArea);
    }
}