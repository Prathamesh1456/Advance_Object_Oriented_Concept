import java.util.Scanner;

public class StackDemo {
    public static void main(String[] args) {
        int maxSize = 5;
        int[] stack = new int[maxSize];
        int top = -1;
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n=== Stack Operations ===");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    if (top == maxSize - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                        stack[++top] = value;
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println(stack[top--] + " popped from stack");
                    }
                    break;
                case 3:
                    if (top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.print("Stack elements: ");
                        for (int i = 0; i <= top; i++) {
                            System.out.print(stack[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}
