import java.util.Scanner;

public class Circle {
    void calculateArea(float radius) {
        float area = (float) (Math.PI * radius * radius);
        System.out.println("Area of the circle: " + area);
    }
    
    void calculateArea(double side) {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }
    
    void calculateArea(float length, float width) {
        float area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.calculateArea(3.0f);
        c1.calculateArea(3.0d);
        c1.calculateArea(2.0f, 5.0f);
    }
}

