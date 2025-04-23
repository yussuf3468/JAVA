class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }

    void fetch() {
        System.out.println("The dog fetches the ball.");
    }
}

class Cat extends Dog {
    void purr() {
        System.out.println("The cat purrs.");
    }

    void scratch() {
        System.out.println("The cat scratches the post.");
    }

    // Overriding eat method to show different behavior for Cat
    void eat() {
        System.out.println("The cat eats fish.");
    }
}