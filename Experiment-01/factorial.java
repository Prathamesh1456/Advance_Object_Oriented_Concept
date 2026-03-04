public class factorial {
    public static void main(String[] args) {
        
        int number=5;
        int factorial = 1;
        if (number < 0) {
            System.out.println("Factorial of a negative number is not possible.");
        } 
	else {
            for (int i = 1; i <= number; i++) {
                factorial *= i; 
          	}
          System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
