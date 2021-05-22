package lesson1;

import java.util.Random;

public class MainApp {
    public static void main (String[] args) {
        printThreeWords();
        printColor();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords () {
        String[] fruitArray = {  "Orange", "Apple", "Bannan", };
        for (String i: fruitArray) {
            System.out.println(i);
        }
    }

    public static void sumSign () {
        int a = 2, b = 3, sum;
        sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor () {
        int value = -10;
        if  (value >100) {
            System.out.println("Зеленый");
        }
        else if  (value <=0) {
            System.out.println("Красный");
        }
        else {
            System.out.println("Желтый");
        }
    }


    public static void compareNumbers () {
        int a = 5, b = 3;
        if  ( a >= b) {
            System.out.println("a >= b" );
        }
        else {
            System.out.println("a < b");
        }
    }
}