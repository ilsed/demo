package be.demo.solid.openclosed.step1;


class AreaCalculator {


    public double calculateAreaCircle(Circle circle) {
        return circle.calculateArea();
    }

    public double calculateAreaRectangle(Rectangle rectangle) {
        return rectangle.calculateArea();
    }

    // I need to calculate the area of a Triangle => What should I do?
}
