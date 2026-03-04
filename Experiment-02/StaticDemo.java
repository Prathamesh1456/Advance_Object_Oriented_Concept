public class StaticDemo {
    static int count;
    static {
        count = 10;
        System.out.println("Static block executed. Initial count = " + count);
    }
    String name;
    public StaticDemo(String name) {
        this.name = name;
        count++;
        System.out.println(name + " object created. Count = " + count);
    }
    static void displayCount() {
        System.out.println("Current count (from static method) = " + count);
    }
    public static void main(String[] args) {
        StaticDemo.displayCount();
        StaticDemo obj1 = new StaticDemo("Object1");
        StaticDemo obj2 = new StaticDemo("Object2");
        StaticDemo.displayCount();
        System.out.println("Final count (direct access) = " + StaticDemo.count);
    }
}
