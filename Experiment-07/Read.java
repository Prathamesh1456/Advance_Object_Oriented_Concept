import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read{
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\PRATHAMESH\\Desktop\\DOCUMENT\\SEM IV\\Advance-Object-Oriented-Programming-Lab\\Sample\\Sample.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}