abstract class Shape {
    abstract double calculateArea();

    void displayMessage() {
        System.out.println("Calculating Shape Area");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 4);

        circle.displayMessage();
        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());

        rectangle.displayMessage();
        System.out.printf("Rectangle Area: %.2f%n", rectangle.calculateArea());
    }
}