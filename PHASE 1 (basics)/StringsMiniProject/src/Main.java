import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Full Name: ");
        String Name = input.nextLine();

        System.out.println("HELLO " + Name.toUpperCase());
//        Print initials
        System.out.println("Initials: " + Name.toUpperCase().charAt(0) + "." + Name.toUpperCase().charAt(Name.indexOf(" ") + 1));

//       The length
        System.out.println(Name.length() + " characters");

        input.close();
    }
}