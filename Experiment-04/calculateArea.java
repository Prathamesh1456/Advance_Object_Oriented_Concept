import java.util.*;
interface Shape {
    double area();  
}
class Rectangle implements Shape{
    double length;
    double breadth;
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    @Override
    public double area(){
        return length*breadth;
    }

}
class Triangle implements Shape{
    double height;
    double base;
    Triangle(double h,double b)
    {
        base=b;
        height=h;
    }
    @Override
    public double area()
    {
        return 0.5*base*height;
    }
}
public class calculateArea {
    public static void main(String[] args) {
        boolean run=true;
        int choice;
        Scanner sc=new Scanner(System.in);
        while (run){
            System.out.println(" 1. Triangle\n 2. Rectangle\n 3. Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch ((choice)) {
                case 1:
                    double b,h;
                    System.out.print("Enter Base of Triangle: ");
                    b=sc.nextDouble();
                    System.out.print("Enter Height of Triangle: ");
                    h=sc.nextDouble();
                    Triangle t=new Triangle(h, b);
                    System.out.println("Area of Triangle is : "+ t.area());
                    break;
                case 2:
                    double br,len;
                    System.out.print("Enter Breadth of Rectangle: ");
                    br=sc.nextDouble();
                    System.out.print("Enter Lenght of Rectangle: ");
                    len=sc.nextDouble();
                    Rectangle r=new Rectangle(len, br);
                    System.out.println("Area of Rectangle is : "+ r.area());
                    break;
                case 3:
                    System.out.println("Program Terminating Here....");
                    run=false;
                    break;
                default:
                    System.out.println("Enter Valid Choice..!!!");
            }
    }
    }
}
