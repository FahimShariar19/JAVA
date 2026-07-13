class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class TestCalculator {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of two integers: " + c.add(10, 20));
        System.out.println("Sum of two decimals: " + c.add(10.5, 20.2));
        System.out.println("Sum of three integers: " + c.add(5, 10, 15));
    }
}