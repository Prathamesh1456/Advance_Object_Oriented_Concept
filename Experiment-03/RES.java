import java.util.Scanner;
class Student {
    int roll_no;
    void get_no(int n) {
        roll_no = n;
    }
    void put_no() {
        System.out.println("Roll No: " + roll_no);
    }
}
class Test extends Student {
    float sub1, sub2,sub3,sub4,sub5;
    void get_marks(float m1, float m2,float m3,float m4,float m5) {
        sub1 = m1;
        sub2 = m2;
        sub3 = m3;
        sub4 = m4;
        sub5 = m5;
    }
    void put_marks() {
        System.out.println("Marks obtained");
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Subject 4: " + sub4);
        System.out.println("Subject 5: " + sub5);
    }
}
class Result extends Test {
    float total;
    void display() {
        total = sub1 + sub2 + sub3 + sub4 + sub5;
        put_no();
        put_marks();
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + ((total*100)/500));
    }
}
public class RES {
    public static void main(String args[]) {
        Result r = new Result();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll No. :- ");
        int roll = sc.nextInt();
        r.get_no(roll);
        float m1,m2,m3,m4,m5;
        System.out.print("Enter Marks of Subject 1: ");
        m1=sc.nextFloat();
        System.out.print("Enter Marks of Subject 2: ");
        m2=sc.nextFloat();
        System.out.print("Enter Marks of Subject 3: ");
        m3=sc.nextFloat();
        System.out.print("Enter Marks of Subject 4: ");
        m4=sc.nextFloat();
        System.out.print("Enter Marks of Subject 5: ");
        m5=sc.nextFloat();
        r.get_marks(m1, m2, m3, m4, m5);
        r.display();
    }
}