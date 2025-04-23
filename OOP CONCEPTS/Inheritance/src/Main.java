public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();


        Dog animal1 = new Dog();
        animal1.eat();
        animal1.sleep();
        animal1.bark();
        animal1.fetch();

        Cat animal3 = new Cat();
        animal3.sleep();
        animal3.eat();
        animal3.bark();
        animal3.fetch();
        animal3.scratch();
        animal3.purr();
    }
}
