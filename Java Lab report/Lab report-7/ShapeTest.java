class Shape {

    int area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}

public class ShapeTest {

    public static void main(String[] args) {

        Shape s = new Shape();

        System.out.println("Area of Rectangle: " + s.area(5, 4));
        System.out.println("Area of Circle: " + s.area(3.5));
    }
}