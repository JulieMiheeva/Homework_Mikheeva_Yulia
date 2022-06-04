package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFed = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("Cat " + name + " with appetite " + appetite);
        if (isFed){
            System.out.println("Cat is not hungry :)");
        } else {
            System.out.println("Cat is hungry :(");
        }
    }

    public void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            isFed = true;
        }
    }
}
