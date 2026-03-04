class Product {
    private int productId;
    private String productName;
    private double price;
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    double getPrice() {
        return price;
    }
    // Display product details
    void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
    }
}

class Customer {
    private int customerId;
    private String customerName;
    Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    void displayCustomer() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
    }
}

class Order {

    private Product product;
    private int quantity;

    // Place an order
    void placeOrder(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        System.out.println("Order placed successfully.");
    }

    // Calculate total order cost
    double calculateTotalCost() {
        return product.getPrice() * quantity;
    }
}

// Main program (uses Ecommerce package classes)
public class EcommerceSystem {

    public static void main(String[] args) {

        Product p1 = new Product(10, "Mobile", 15000);
        Customer c1 = new Customer(1, "Prathamesh");

        System.out.println("---- Product Details ----");
        p1.displayProduct();

        System.out.println("\n---- Customer Details ----");
        c1.displayCustomer();

        Order order = new Order();
        order.placeOrder(p1, 2);

        System.out.println("\nTotal Order Cost = " + order.calculateTotalCost());
    }
}