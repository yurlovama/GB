package lesson2;

public class New {
    public static void main(String[] args) {
        boolean isMoreTenLessTwenty =  within10and20( 5,6);
        System.out.println(isMoreTenLessTwenty ? "Больше 10 но меньше 20" : "Не находится в пределах от 10 до 20");
        isPositiveOrNegative(-6);
        boolean isNegative = isNegative ( -9);
        System.out.println(isNegative ? "Отрицательное" : "Положительное");
        printWordNTimes ("test", 15);
        boolean year = year(2020);
        System.out.println(year ? "Високосный" : "Обычный");

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
        return  a < 0;
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++ ) {
            System.out.printf("i = %d" + " word -  %s%n", i, word);
        }
        System.out.println();
    }
    public static Boolean year (int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
