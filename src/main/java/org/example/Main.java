package main.java.org.example;

import main.java.org.example.task1.Cat;
import main.java.org.example.task1.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        System.out.println(cat.makeSound());

        Dog dog = new Dog("Sharik");
        System.out.println(dog.makeSound());
    }
}

