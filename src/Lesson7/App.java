package Lesson7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("Obzhora", 100);
        Cat cat2 = new Cat ("Tom", 15);
        Cat cat3 = new Cat ("Balam", 60);

        Cat[] cats = {cat1, cat2, cat3};
        Plate plate = new Plate(110);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }


        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }
}
