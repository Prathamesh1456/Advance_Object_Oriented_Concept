import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        int maxSize = 5;
        int[] queue = new int[maxSize];
        int front = 0, rear = -1;
        Scanner sc = new Scanner(System.in);
        int choice, value;
        do {
            System.out.println("\n=== Queue Operations ===");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    if (rear == maxSize - 1) {
                        System.out.println("Queue Overflow");
                    } else {
                        queue[++rear] = value;
                        System.out.println(value + " enqueued into queue");
                    }
                    break;
                case 2:
                    if (front > rear) {
                        System.out.println("Queue Underflow");
                    } else {
                        System.out.println(queue[front++] + " dequeued from queue");
                    }
                    break;
                case 3:
                    if (front > rear) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.print("Queue elements: ");
                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
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
        sc.close();
    }
}
