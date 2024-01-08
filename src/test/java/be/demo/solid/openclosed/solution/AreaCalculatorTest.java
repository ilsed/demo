package be.demo.solid.openclosed.solution;

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

        assertEquals(areaCalculator.calculateArea(rectangle), 50.0);
    }

    @Test
    public void testAreaCalculatorForCircle() {
        Circle circle = new Circle(7);

        assertEquals(areaCalculator.calculateArea(circle), 153.86);
    }

    @Test
    public void testAreaCalculatorForTriangle() {
        Triangle triangle = new Triangle(4, 6);

        assertEquals(areaCalculator.calculateArea(triangle), 12.0);
    }
}
