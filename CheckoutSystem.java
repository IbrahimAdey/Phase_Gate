import java.util.*;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class CheckoutSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> cart = new ArrayList<>();

        while (true) {
            System.out.print("Enter product name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Enter price: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            cart.add(new Product(name, price, quantity));
        }

        double total = 0;
        for (Product product : cart) {
            total += product.getTotal();
        }

        double vat = total * 0.075;
        double discount = total * 0.1;
        double finalTotal = total + vat - discount;

        System.out.println("\n=== SEMICOLON STORE INVOICE ===");
        for (Product product : cart) {
            System.out.printf("%s x%d - $%.2f\n", product.name, product.quantity, product.getTotal());
        }
        System.out.printf("Subtotal: $%.2f\nVAT: $%.2f\nDiscount: $%.2f\nTotal Due: $%.2f\n", total, vat, discount, finalTotal);
    }
}