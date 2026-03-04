import java.util.Scanner;
import java.util.ArrayList;
abstract class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;
    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    abstract double calculateBonus();
    abstract void performanceReport();
    abstract void manageProject();
    void displayDetails() {
        System.out.println("Name: " + name + ", Address: " + address + ", Salary: $" + salary + ", Job Title: " + jobTitle);
    }
}
class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
    @Override
    double calculateBonus() {
        return salary * 0.2;
    }
    @Override
    void performanceReport() {
        System.out.println("Manager " + name + " has successfully managed the team and projects.");
    }
    @Override
    void manageProject() {
        System.out.println(name + " is managing company projects.");
    }
}
class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
    @Override
    void performanceReport() {
        System.out.println("Developer " + name + " has successfully completed assigned tasks.");
    }
    @Override
    void manageProject() {
        System.out.println(name + " is developing new software features.");
    }
}
class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
    @Override
    double calculateBonus() {
        return salary * 0.12;
    }
    @Override
    void performanceReport() {
        System.out.println("Programmer " + name + " has efficiently coded assigned modules.");
    }
    @Override
    void manageProject() {
        System.out.println(name + " is writing and debugging code.");
    }
}
public class CompanyHierarchyDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n=== Employee Menu ===");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. Add Programmer");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter Manager name: ");
                    String mName = sc.nextLine();
                    System.out.print("Enter address: ");
                    String mAddress = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double mSalary = sc.nextDouble();
                    employees.add(new Manager(mName, mAddress, mSalary));
                    break;

                case 2:
                    System.out.print("Enter Developer name: ");
                    String dName = sc.nextLine();
                    System.out.print("Enter address: ");
                    String dAddress = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double dSalary = sc.nextDouble();
                    employees.add(new Developer(dName, dAddress, dSalary));
                    break;

                case 3:
                    System.out.print("Enter Programmer name: ");
                    String pName = sc.nextLine();
                    System.out.print("Enter address: ");
                    String pAddress = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double pSalary = sc.nextDouble();
                    employees.add(new Programmer(pName, pAddress, pSalary));
                    break;

                case 4:
                    System.out.println("\n=== Employee Details and Actions ===");
                    for (Employee emp : employees) {
                        emp.displayDetails();
                        System.out.println("Bonus: $" + emp.calculateBonus());
                        emp.performanceReport();
                        emp.manageProject();
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
}