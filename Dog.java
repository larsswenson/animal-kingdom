public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Dog method
    public void wagTail() {
        System.out.println(name + " is wagging its tail.");
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}

