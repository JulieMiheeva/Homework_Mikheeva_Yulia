package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        String[][] field = initField(3);
        printField(field);


        while (true) {
            humanMakeTurn(field);
            printField(field);
            if (isWinner(field, "x")) {
                System.out.println("X won");
                break;

            }
            if (isDraw(field)) {
                break;
            }

            aiMakeTurn(field);
            printField(field);
            if (isWinner(field, "0")) {
                System.out.println("0 won");
                break;
            }
            if (isDraw(field)) {
                break;
            }
        }
    }


    //Инициализация игрового поля
    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    //Печать игрового поля
    public static void printField(String[][] field) {
        System.out.println("---------");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(("---------"));
    }

    //ход человека (мы не должны выйти за игровое поле, мы не можем сходить туда куда уже сходили)
    public static void humanMakeTurn(String[][] field) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt() - 1; //1
            int y = sc.nextInt() - 1; //1
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "x";
                    break;
                } else {
                    System.out.println("Occupied, make another move");
                }
            } else {
                System.out.println("Beyond the field, make another move");
            }
        }

    }

    //ии делает ход
    public static void aiMakeTurn(String[][] field) {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "0";
                    break;
                }
            }
        }
    }

    //проверка победы
    public static boolean isWinner(String[][] field, String turn) {
        //горизонталь
        for (int i = 0; i < field.length; i++) {
            boolean result = true;
            for (int j = 0; j < field.length; j++) {
                if ((!field[i][j].equals(turn))) {
                    result = false;
                    break;
                }
            }
                if (result) {
                    return true;
                }
            }

        //вертикаль
        for (int i = 0; i < field.length; i++) {
            boolean result = true;
            for (int j = 0; j < field.length; j++) {
                if ((!field[j][i].equals(turn))) {
                    result = false;
                    break;
                }
            }
                if (result) {
                    return true;
                }
            }

        //одна диагональ
        boolean result = true;
        for (int i = 0; i < field.length; i++) {
            if ((!field[i][i].equals(turn))) {
                result = false;
                break;
            }
        }
        if (result) {
            return true;
        }

        //другая диагональ
        boolean resultAnother = true;
        for (int i = 0; i < field.length; i++) {
            if ((!field[i][(field.length - 1) - i].equals(turn))) {
                resultAnother = false;
                break;
            }
        }
        if (resultAnother) {
            return true;
        }
        return false;
    }

    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Draw");
        return true;
    }
}
