public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // Cat method
    public void purr() {
        System.out.println(name + " is purring.");
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}

