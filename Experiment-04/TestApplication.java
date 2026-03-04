import java.util.*;
import javax.sound.sampled.SourceDataLine;
interface  Sports {
    int sMarks=0;
    void set(int marks);  
}
class Student{
    int rollNo;
    int getRollNo(){
        return rollNo;
    }
    void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
}
class Test extends Student{
    int sub1,sub2;
    void getMarks(){
        System.out.println("Subject 1 Marks: "+ sub1);
        System.out.println("Subject 2 Marks: "+ sub2);
    }
    void setMarks(int sub1,int sub2){
        this.sub1=sub1;
        this.sub2=sub2;
    }
    int getSub2(){
        return sub2;
    }
    int getSub1(){
        return sub1;
    }
}
class Result extends Test implements Sports{
    int sportsMarks;
    public void set(int marks){
        this.sportsMarks=marks;
    }
    public void display(){
        System.out.println("Roll No:- "+getRollNo());
        System.out.println("Sports Marks:- "+ sportsMarks);
        System.out.println("Total Marks is: "+(getSub1()+getSub2()+sportsMarks));
    }
}
public class TestApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Result r=new Result();
        System.out.print("Enter Roll No:- ");
        int rn=sc.nextInt();
        r.setRollNo(rn);
        System.out.println("Enter Marks of Subject 1: ");
        int m1=sc.nextInt();
        System.out.println("Enter Marks of Subject 2: ");
        int m2=sc.nextInt();
        r.setMarks(m1, m2);
        System.out.println("Enter Marks of Sports: ");
        int sm=sc.nextInt();
        r.set(sm);
        r.display();
    }
}