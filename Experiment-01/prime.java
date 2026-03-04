import java.util.*;
public class prime {
    public static void main(String[] args) {
        boolean Prime = true;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextInt();
        if (number < 2) {
            Prime = false;
        } 
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    Prime = false;
                    break;
                }
            }  
        }  
        if (Prime) {
            System.out.println(number + " is a prime number.");
        } 
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
}