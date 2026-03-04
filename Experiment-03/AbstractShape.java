import java.util.Scanner;
abstract class Shape{
    double dim1;
    double dim2;
    Shape(double d1,double d2){
        dim1=d1;
        dim2=d2;
    }
    abstract double area();
}
class Rectangle extends Shape {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    @Override
    double area() {
        return dim1 * dim2;
    }
}
class Triangle extends Shape {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}
public class AbstractShape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Area of Triangle");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter Height of Triangle: ");
                        double height = sc.nextDouble();
                        System.out.print("Enter Base of Triangle: ");
                        double base = sc.nextDouble();
                        Shape triangle = new Triangle(height, base); 
                        System.out.println("Area of Triangle: " + triangle.area());
                        break;
                     case 2:
                        System.out.print("Enter Length of Rectangle: ");
                        double length = sc.nextDouble();
                        System.out.print("Enter Width of Rectangle: ");
                        double width = sc.nextDouble();
                        Shape rectangle = new Rectangle(length, width); 
                        System.out.println("Area of Rectangle: " + rectangle.area());
                        break;
                    case 3:
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option (1, 2, or 3).");
                }
            } while (choice != 3);
    }
}