public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Yussuf");
        person.setAge(25);

//        demonstrating encapsulation
        System.out.println("I can access this variable because it is public(not encapsulated): " + person.height);
//        System.out.println("I cannot access this because it is private hence encapsulated: " + person.age)


        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}