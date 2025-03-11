import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("Temperature Converter");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            // Read the user's choice
            int choice = scanner.nextInt();

            // Handle the choice
            if (choice == 1) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + "°C is " + fahrenheit + "°F");
            } else if (choice == 2) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + "°F is " + celsius + "°C");
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}