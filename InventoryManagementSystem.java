import java.util.*;
class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public String toString() {
        return "Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Product> List = new ArrayList<>();
        Map<String, Product> m = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. List Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    int price = scanner.nextInt();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();

                    Product product = new Product(name, price, quantity);
                    List.add(product);
                    m.put(name, product);
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String Remove = scanner.next();

                    if (m.containsKey(Remove)) {
                        Product productRemove = m.get(Remove);
                        List.remove(productRemove);
                        m.remove(Remove);
                        System.out.println("Product removed successfully.");
                    } else {
                        System.out.println("Product not found in inventory.");
                    }
                    break;

                case 3:
                    System.out.println("Product List:");
                    for (Product p : List) {
                        System.out.println(p);
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}