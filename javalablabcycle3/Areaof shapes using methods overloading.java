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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. Calculate the area of a circle");
        System.out.println("2. Calculate the area of a square");
        System.out.println("3. Calculate the area of a rectangle");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                float radius = scanner.nextFloat();
                c1.calculateArea(radius);
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                c1.calculateArea(side);
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                float length = scanner.nextFloat();
                System.out.print("Enter the width of the rectangle: ");
                float width = scanner.nextFloat();
                c1.calculateArea(length, width);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        scanner.close();
    }
}
