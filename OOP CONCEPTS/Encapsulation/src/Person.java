public class Person {
//    Data members(cannot be accessed outside this class)
    private String name;
    private int age;
//    Data members that can be accessed outside the class
    int height = 2345;


//    Methods that work on the data members
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
}