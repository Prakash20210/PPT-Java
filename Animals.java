import java.util.*;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("The cat meows");
    }
}

class Cow extends Animal {

    public void makeSound() {
        System.out.println("The cow mooes");
    }
}

public class Animals {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animal.makeSound(); 
        dog.makeSound();     
        cat.makeSound();     
        cow.makeSound();   
    } 
}
