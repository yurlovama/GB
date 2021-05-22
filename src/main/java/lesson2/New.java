package lesson2;

public class New {
    public static void main(String[] args) {
        within10and20( 5,6);
        isPositiveOrNegative(-6);
        isNegative ( -9);
        printWordNTimes ("test", 15);

    }

    public static boolean within10and20(int a, int b) {
        int sum;
        sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }
    public static boolean isNegative(int a) {
        if (a >= 0) {
            return true;
        } else {
        return false;
        }
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++ ) {
            System.out.printf("i = %d" + " word -  %s%n", i, word);
        }
        System.out.println();
    }
}
