import java.util.Scanner;
interface Stack {
    int size = 5; 
    void push(int value);
    void pop();
    void display();
    void overflow();
    void underflow();
}
class IntegerStack implements Stack {
    private int[] stack = new int[size];
    private int top = -1;
    @Override
    public void push(int value) {
        if (top == size - 1) {
            overflow();
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }
    @Override
    public void pop() {
        if (top == -1) {
            underflow();
        } else {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }
    @Override
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    @Override
    public void overflow() {
        System.out.println("Stack Overflow! Cannot push more elements.");
    }
    @Override
    public void underflow() {
        System.out.println("Stack Underflow! No elements to pop.");
    }
}
public class TestIntegerStack {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        while(run){
        System.out.println("=== Stack Operations ===");
        System.out.println(" 1.Push\n 2.Pop\n 3.Display\n 4.Exit");
        System.out.print("Enter your Choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter the value you want to push: ");
                int value=sc.nextInt();
                stack.push(value);
                break;
            case 2:
                stack.pop();
                break;
            case 3:
                stack.display();
                break;
            case 100:
                System.out.println("Program Terminates Here..");
                run=false;
                break;
            default:
                System.out.println("Enter Valid Choice");
                
        }
        


       

        }
    }
}
