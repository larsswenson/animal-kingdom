public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    // Bird method
    public void fly() {
        System.out.println(name + " is flying.");
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }
}

