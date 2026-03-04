import java.util.Scanner;
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

class NumberCheck {

    public void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd!");
        }
        System.out.println("Number is even.");
    }
}

public class OddNumber {
    public static void main(String[] args) {

        NumberCheck obj = new NumberCheck();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            obj.checkNumber(number);
        } catch (OddNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}