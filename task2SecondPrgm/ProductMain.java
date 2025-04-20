package task2SecondPrgm;

import java.util.Scanner;

public class ProductMain {
       
	public static double calcTotalAmount(Product[] products) {
		double total = 0;
		for (Product p : products) {
			total += p.price * p.quantity;
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // get 5 product details
        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            // Create product object using parameterized constructor
            products[i] = new Product(pid, price, quantity);
            System.out.println();
        }

        // Find PID of product with highest price
        double maxPrice = products[0].price;
        int maxPricePid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPricePid = products[i].pid;
            }
        }

        System.out.println("Product with the highest price has PID: " + maxPricePid);

        // Calculate total amount spent
        double totalAmount = calcTotalAmount(products);
        System.out.println("Total amount spent on all products: $" + totalAmount);
        
        
	}

}
