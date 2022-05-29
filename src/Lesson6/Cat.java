package Lesson6;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length < 200){
            System.out.println("Cat ran");
        }
        else {
            System.out.println("Cat is tried");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Cat can't swim");
    }
}
