import java.util.Scanner; // Import Scanner class to read input

public class Main {

    // -------------------------------------
    // NOTES ABOUT SCANNER AND USER INPUT
    // -------------------------------------

    /*
     * In Java, you can allow the user to enter input,
     * save that input, and then print it out.
     *
     * This is done using the Scanner class.
     * It is used to read input such as Strings, integers, doubles, etc.
     *
     * -------------------------
     * ❓ What is Scanner?
     * -------------------------
     * ➜ Scanner is a built-in Java class
     *    that lets your program read input from the keyboard.
     *
     * ------------------------------
     * ❓ How do you use Scanner?
     * ------------------------------
     * ➜ First, you need to import it at the top of your file:
     *      import java.util.Scanner;
     * ➜ Then, create a Scanner object inside your code.
     */

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        input.nextLine(); /* to clear buffer */

        //Gender it will be skipped bcz if u want to use next line after using next int u might need to clear the buffer.
        // or u can use next(); instead of nextLine(); and comment out the line that clears the buffer.
        // so before asking for gender type input.nextlLine(); like above

        System.out.print("Enter your gender: ");
        String gender = input.nextLine();

        // Display user input
        System.out.println("\n--- User Info ---");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your gender is: " + gender);

        // Close the scanner (good practice)
        input.close();
    }
}
