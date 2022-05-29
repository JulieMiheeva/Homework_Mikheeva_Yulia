package Lesson6;

abstract public class Animal {
    private String name;

    abstract public void run(int length);

    public Animal(String name) {
        this.name = name;
    }

    abstract public void swim(int length);
}
