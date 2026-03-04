import java.util.Scanner;
class Area{
	int length;
	int breadth;
	void SetDim(int l,int b){
		length=l;
		breadth=b;
	}
	int getArea(){
		return length*breadth;
	}
}
public class Rectangle{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length:  ");
		int length=sc.nextInt();
		System.out.println("Enter Breadth:  ");
		int breadth=sc.nextInt();
		Area rect= new Area();
		rect.SetDim(length, breadth);
		System.out.println("Area of Rectangle:  "+ rect.getArea());
	}
}