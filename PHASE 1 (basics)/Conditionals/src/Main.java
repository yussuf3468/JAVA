import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * This program demonstrates how to use if, else if, and else statements in Java.
         *
         * ➤ These are conditional statements — they help your program make decisions
         *    based on different conditions.
         *
         * ➤ Basic Syntax:
         *     if (condition) {
         *         // runs if condition is true
         *     } else if (anotherCondition) {
         *         // runs if the first one is false, but this is true
         *     } else {
         *         // runs if none of the above conditions are true
         *     }
         */

        int age = 0;
        boolean valid = false;

        // Keep prompting the user until a valid number is entered
        while (!valid) {
            System.out.print("Enter your age: ");

            if (input.hasNextInt()) {
                age = input.nextInt();
                valid = true;
            } else {
                System.out.println("❌ Invalid input. Please enter a number.");
                input.nextLine(); // Clear invalid input from buffer
            }
        }

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are allowed to vote ✅");
        } else {
            System.out.println("You are too young to vote ❌");
        }

        input.nextLine();
        //    another example
        System.out.print("Enter your favourite color: ");
        String color = input.nextLine();

        if (color.equalsIgnoreCase("Blue")) {
            System.out.println("That is my favourite color");
        } else if (color.equals("Red")) {
            System.out.println("Blue is better");
        } else {
            System.out.println("That's not bad!");
        }
        input.close();
    }
}
