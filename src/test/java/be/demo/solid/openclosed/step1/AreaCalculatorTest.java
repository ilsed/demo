package be.demo.solid.openclosed.step1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class AreaCalculatorTest {

    private AreaCalculator areaCalculator;

    @BeforeEach
    public void setup() {
        areaCalculator = new AreaCalculator();
    }

    @Test
    public void testAreaCalculatorForRectangle() {
        Rectangle rectangle = new Rectangle(5, 10);

        assertEquals(areaCalculator.calculateAreaRectangle(rectangle), 50.0);
    }

    @Test
    public void testAreaCalculatorForCircle() {
        Circle circle = new Circle(7);

        assertEquals(areaCalculator.calculateAreaCircle(circle), 153.86);
    }

    @Test
    public void testAreaCalculatorForTriangle() {

        // To IMPLEMENT
    }
}
