public class Main {
    public static void main(String[] args) {
        // Instances of subclasses
        Dog dog = new Dog("Snoopy", 3);
        Cat cat = new Cat("Garfield", 5);
        Bird bird = new Bird("Woody", 2);

        // Call methods on instances
        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.wagTail();
        System.out.println("---");

        cat.eat();
        cat.sleep();
        cat.makeSound();
        cat.purr();
        System.out.println("---");

        bird.eat();
        bird.sleep();
        bird.makeSound();
        bird.fly();
        System.out.println("---");

        // Array of animals & call methods w/ for loop
        Animal[] animals = {dog, cat, bird};
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println("---");
        }
    }
}

