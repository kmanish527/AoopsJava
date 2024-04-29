package Design_Patterns.StructuralPattern.DecoratorPattern;
import java.util.Scanner;

// this is the main class in this the customer can select either Hot Coffee or Cold Coffee and
// the based on his choice he can add any addons like Chocolate , cream , extra sugar any number of times

public class Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'hot' for hot coffee or 'cold' for cold coffee:");
        String coffeeType = scanner.nextLine().toLowerCase();

        Coffee coffee;
        if (coffeeType.equals("hot")) {
            coffee = new HotCoffee();
        } else if (coffeeType.equals("cold")) {
            coffee = new ColdCoffee();
        } else {
            System.out.println("Invalid coffee type. Please enter 'hot' or 'cold'.");
            scanner.close();
            return;
        }


        boolean addMoreAddons = true;
        while (addMoreAddons) {
            System.out.println("Choose an addon to add: ");
            System.out.println("1. Chocolate");
            System.out.println("2. Cream");
            System.out.println("3. Extra Sugar");
            System.out.println("4. Done adding addons");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    coffee = new DecoratorChocolate(coffee);
                    break;
                case 2:
                    coffee = new DecoratorCream(coffee);
                    break;
                case 3:
                    coffee = new DecoratorExtraSugar(coffee);
                    break;
                case 4:
                    addMoreAddons = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }

            if (addMoreAddons) {
                System.out.println("Add more addons? (yes/no):");
                String more = scanner.nextLine().toLowerCase();
                if (!more.equals("yes")) {
                    addMoreAddons = false;
                }
            }
        }

        System.out.println("Cost of coffee with addons: " + coffee.cost());

        scanner.close();
    }
}
