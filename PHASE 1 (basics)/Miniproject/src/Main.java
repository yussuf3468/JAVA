import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter the number of Students: ");
        int size = input.nextInt();

        // Declare arrays for names and marks
        String[] Names = new String[size];
        int[] Marks = new int[size];

        input.nextLine();  // Consume the newline character left by nextInt()

        // Get student names and marks
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name for student: ");
            Names[i] = input.nextLine();

            System.out.print("Enter marks: ");
            Marks[i] = input.nextInt();
            input.nextLine();  // Consume the newline character left by nextInt()
        }

        // Print the result
        System.out.println("--------Result--------");
        for (int i = 0; i < size; i++) {
            char grade = ' ';

            // Assign grades based on marks
            if (Marks[i] < 40) {
                grade = 'F';
            } else if (Marks[i] >= 40 && Marks[i] < 60) {
                grade = 'C';
            } else if (Marks[i] >= 60 && Marks[i] < 80) {
                grade = 'B';
            } else if (Marks[i] >= 80) {
                grade = 'A';
            } else {
                System.out.print("Cannot be graded! Invalid marks.");
            }

            // Print student name, marks, and grade
            System.out.printf("%s    %d    %c \n", Names[i], Marks[i], grade);
        }

        input.close();  // Close the scanner
    }
}
