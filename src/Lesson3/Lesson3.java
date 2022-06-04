package Lesson3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        createMatrix();
        returnArray(20, 5);
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        System.out.println(" ");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print(arr[i] * 2 + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }


    public static void createMatrix() {
        int[][] arr4 = new int[8][8];

        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][(arr4.length - 1) - i] = 1;
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static int[] returnArray(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }
        System.out.println();
        return arr5;
    }
}
