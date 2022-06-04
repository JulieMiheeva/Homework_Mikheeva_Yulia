package Lesson6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
    if (length < 500){
        System.out.println("Dog ran");
    }
    else {
        System.out.println("Dog is tried");
    }
    }

    @Override
    public void swim(int length) {
        if (length < 10){
            System.out.println("Dog swam");
        }
        else {
            System.out.println("Dog is tried");
        }
    }
}
