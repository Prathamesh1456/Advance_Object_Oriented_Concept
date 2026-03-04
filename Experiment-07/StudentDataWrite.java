import java.io.*;
import java.util.Scanner;

public class StudentDataWrite {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Weight: ");
            double weight = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();
            sc.nextLine();  

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            FileOutputStream fos = new FileOutputStream("student.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

            dos.close();
            System.out.println("Data stored successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}