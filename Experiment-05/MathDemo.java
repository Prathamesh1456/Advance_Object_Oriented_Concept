class FloorOperation {
    double getFloor(double num) {
        return Math.floor(num);
    }
}
class CeilOperation {
    double getCeil(double num) {
        return Math.ceil(num);
    }
}
class RoundOperation {
    long getRound(double num) {
        return Math.round(num);
    }
}

public class MathDemo {
    public static void main(String[] args) {
        double n1 = 5.7;
        double n2 = 3.2;
        double n3 = 8.5;
        FloorOperation f = new FloorOperation();
        CeilOperation c = new CeilOperation();
        RoundOperation r = new RoundOperation();
        System.out.println("Number 1 : " + n1);
        System.out.println("Floor    : " + f.getFloor(n1));
        System.out.println("\nNumber 2 : " + n2);
        System.out.println("Ceil     : " + c.getCeil(n2));
        System.out.println("\nNumber 3 : " + n3);
        System.out.println("Round    : " + r.getRound(n3));
    }
}