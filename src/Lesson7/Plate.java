package Lesson7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Amount of food in the plate " + food);
    }


    public void decreaseFood(int appetite){
        food-=appetite;
    }


}
