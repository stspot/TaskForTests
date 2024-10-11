import java.util.Scanner;

public class TaskOneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Available Products:");
        System.out.println("1. Snack - $1.50");
        System.out.println("2. Soda - $1.00");
        System.out.println("3. Juice - $2.50");
        System.out.println("4. Water - $0.50");
        System.out.print("Select a product (1-4): ");
        int productChoice = scanner.nextInt();
        System.out.print("Insert coins ($): ");
        double insertedMoney = scanner.nextDouble();
        double productPrice = 0.0;
        String productName = "";

        if (productChoice == 1) {
            productPrice = 1.50;
            productName = "Snack";
        } else if (productChoice == 2) {
            productPrice = 1.01;
            productName = "Soda";
        } else if (productChoice == 3) {
            productPrice = 2.55;
            productName = "Juice";
        } else if (productChoice == 4) {
            productPrice = 0.50;
            productName = "Water";
        } else {
            System.out.println("Invalid product choice. Please select a valid product.");
            return;
        }

        if (insertedMoney < productPrice) {
            System.out.println("Not enough money inserted. Please insert at least $" + productPrice);
            return;
        } else if (insertedMoney > 5.00) {
            System.out.println("Too much money inserted. Please try again.");
            return;
        }

        System.out.println("Dispensing " + productName + "...");

        double change = insertedMoney - productPrice;
        if (change < 0) {
            System.out.println("Error in change calculation.");
        } else if (change == 0) {
            System.out.println("No change to return.");
        } else {
            System.out.println("Your change is: $" + change);
        }

        System.out.println("Thank you for using the Vending Machine!");
        scanner.close();
    }
}
