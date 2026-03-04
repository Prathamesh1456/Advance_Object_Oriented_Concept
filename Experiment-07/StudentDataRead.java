import java.io.*;

public class StudentDataRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.dat");
            DataInputStream dis = new DataInputStream(fis);

            String name = dis.readUTF();
            int age = dis.readInt();
            double weight = dis.readDouble();
            double height = dis.readDouble();
            String city = dis.readUTF();
            String phone = dis.readUTF();

            System.out.println("----- Student Details -----");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
            System.out.println("City: " + city);
            System.out.println("Phone: " + phone);

            dis.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}