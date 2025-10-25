package main.java.org.example.task1;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Gav-Gav!!!";
    }
}
