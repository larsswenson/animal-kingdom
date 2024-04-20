# Animal Kingdom 

This Java app simulates an animal kingdom. The program uses inheritance to categorize animals and assign behaviors for them.

## Overview

The program consists of superclass `Animal` and a few subclasses. Each subclass represents a different animal and specific methods are overridden to assign behavior unique to each one.

### SuperClass Animal

**Properties:**
- `name` (String)
- `age` (int)

**Methods:**
- `eat()`: Prints a message about eating.
- `sleep()`: Prints a message about sleeping.
- `makeSound()`: Abstract method overridden in subclasses to make specific sounds.
- `displayInfo()`: Prints animal's name and age.

### Subclasses

- `Dog`: Represents dog. Overrides `makeSound()` method to bark and includes method `wagTail()`.
- `Cat`: Represents cat. Overrides `makeSound()` method to meow and includes method `purr()`.
- `Bird`: Represents bird. Overrides `makeSound()` method to chirp and includes method `fly()`.

## Running Program

1. **Compile Java Files:**
   - Java Development Kit (JDK) required.
   - Open terminal or command prompt.
   - Navigate to directory containing Java files.
   - Compile files: `javac *.java`

2. **Run Main:**
   - After compilation, run `Main` class: `java Main`

3. **View Output:**
   - Program will simulate behaviors of animals and display output in terminal.

## Other Features

- Each subclass includes a method specific to that animal.
- `super` keyword is used to extend superclass method.

## Testing

In `Main` class, instances of each subclass are created and methods are invoked to ensure they behave as expected.
