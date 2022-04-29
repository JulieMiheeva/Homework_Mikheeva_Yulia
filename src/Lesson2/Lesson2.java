package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        boolean a = within10and20(30, 1);
        System.out.println(a);
        if (a) {
            System.out.println("Task 1 : Well done!");
        }
        if (!a) {
            System.out.println("Task 1 : Wrong!");
        }
        isPositiveOrNegative(0);
        //isNegative (-7);
        System.out.println("Task 3 : " + isNegative(-7));
        printWordNTimes("Some words", 5);
    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 30) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Task 2 : The number " + x + " is positive");
        } else {
            System.out.println("Task 2 : The number " + x + " is negative");
        }
    }

    public static boolean isNegative(int x) {
        return x < 0;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Task 4: " + "Round " + i + " from " + word);
        }
    }
}
