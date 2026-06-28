abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    double radius = 7;
 @Override
    void area() {
        double result = 3.1416 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {

    double length = 10;
    double width = 5;
 @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class TestShape {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}
