import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. For Loop");
            System.out.println("2. While Loop (Even numbers from 2 to 10)");
            System.out.println("3. Do-While Loop (Numbers 0 to 2)");
            System.out.println("4. Multiplication Table");
            System.out.println("5. Pyramid Patterns");
            System.out.println("6. Exit");

            System.out.print("Enter your Choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> printForLoop();
                case 2 -> printWhileLoop();
                case 3 -> printDoWhileLoop();
                case 4 -> printMultiplicationTable();
                case 5 -> printPyramids(input);
                case 6 -> {
                    System.out.println("Exiting...");
                    input.close();
                    return;
                }
                default -> System.out.println("Invalid option! Please choose a valid option.");
            }
        }
    }

    private static void printForLoop() {
        System.out.println("\nFor loop: Number from 1 - 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    private static void printWhileLoop() {
        System.out.println("\nWhile loop: Even numbers from 2 to 10");
        int j = 2;
        while (j <= 10) {
            System.out.println("j = " + j);
            j += 2;
        }
    }

    private static void printDoWhileLoop() {
        System.out.println("\nDo-While loop: Numbers from 0 to 2");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 3);
    }

    private static void printMultiplicationTable() {
        System.out.println("\nMultiplication Table (1 to 5):");
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                System.out.printf("%-4d", r * c);
            }
            System.out.println();
        }
    }

    private static void printPyramids(Scanner input) {
        System.out.println("\nChoose Pyramid Pattern:");
        System.out.println("1. Left Aligned Pyramid");
        System.out.println("2. Upside Down Pyramid");
        System.out.println("3. Centered Pyramid");
        System.out.println("4. Back to Menu");

        System.out.print("Enter your Choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1 -> printLeftAlignedPyramid();
            case 2 -> printUpsideDownPyramid();
            case 3 -> printCenteredPyramid(input);
            case 4 -> System.out.println("Returning to main menu...");
            default -> System.out.println("Invalid choice! Going back to menu.");
        }
    }

    private static void printLeftAlignedPyramid() {
        System.out.println("\nLeft Aligned Pyramid:");
        for (int y = 0; y <= 5; y++) {
            for (int z = 0; z <= y; z++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static void printUpsideDownPyramid() {
        System.out.println("\nUpside Down Pyramid:");
        for (int a = 5; a >= 0; a--) {
            for (int b = 0; b <= a; b++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static void printCenteredPyramid(Scanner input) {
        System.out.print("\nEnter height for Centered Pyramid: ");
        int height = input.nextInt();

        if (height <= 0) {
            System.out.println("Height must be a positive number.");
            return;
        }

        for (int i = 1; i <= height; i++) {
            System.out.print(" ".repeat(height - i));
            System.out.println("#".repeat(2 * i - 1));
        }
    }
}
