// Class with a constructor and main method
public class Main {
    int x;

    // Constructor of Main class
    public Main(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        // Part 1: Test Main constructor
        Main myObj = new Main(5);
        System.out.println("Value of x = " + myObj.x);

        System.out.println(); // Just for spacing

        // Part 2: Create and display Student details
        Student objStud = new Student("David", "302, Washington Street");
        objStud.displayDetails();
    }
}

// Class for a with constructor overloading
class Student {
    int rollNo;
    String name;
    String address;
    float marks;

    public Student() {
        rollNo = 0;
        name = "Unknown";
        address = "Not Provided";
        marks = 0.0f;
    }

    public Student(int rNo, String sName) {
        rollNo = rNo;
        name = sName;
        address = "Not Provided";
        marks = 0.0f;
    }

    public Student(int rNo, float score) {
        rollNo = rNo;
        name = "Unknown";
        address = "Not Provided";
        marks = score;
    }

    public Student(String sName, String addr) {
        rollNo = 0;
        name = sName;
        address = addr;
        marks = 0.0f;
    }

    public Student(int rNo, String sName, float score) {
        rollNo = rNo;
        name = sName;
        address = "Not Provided";
        marks = score;
    }

    public void displayDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Address : " + address);
        System.out.println("Marks   : " + marks);
        System.out.println("---------------------------");
    }
}
