package lesson4;
import java.util.Random;
import java.util.Scanner;


public class Krestik {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static char[][] map;
    public static final int SIZE = 3;


    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static boolean firstInput = true;
    public static int countStep = 0;
    public static int whoWin = 0;

    public static void main(String[] args) {
        map = initMap(SIZE, DOT_EMPTY);
        printMap(map);
        while (countStep < SIZE * SIZE) {
            countStep++;
            if (countStep % 2 != 0) {
                humanTurn();
            } else {
                compTurn();
                System.out.println("Компьютер сходил");
                printMap(map);
            }
            if (countStep >= 5) {
                char sign = (countStep % 2 != 0) ? DOT_X : DOT_O;
                whoWin = isEndOfGame(sign);
                if (whoWin != 0) break;
            }
        }

        if (whoWin != 0){
            if (whoWin == 1) {
                System.out.println("Победил человек");
            } else  {
                System.out.println("Победил Искуственный Интеллект");
            }
        } else {
            System.out.println("Ничья");
        }
        printMap(map);
        System.out.println("Игра закончена");

    }

    public static char[][] initMap(int size, char initValue) {
        char[][] array = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = initValue;
            }
        }
        return array;
    }

    public static void printMap(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void humanTurn() {
        int x, y;
        if (!firstInput) {
            changeFirstInput(true);
        }
        System.out.println( "Введите координаты (x, y)  от 1 до " + SIZE);
        do {
            if (!firstInput) {
                System.out.println("Не верные координаты, либо поле уже занято");
                System.out.println( "Введите координаты (x, y)  от 1 до " + SIZE);
            }
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isValidCoords(x,y));
        map[x][y] = DOT_X;
    }

    public static void compTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isValidCoords(x,y));
        map[x][y] = DOT_O;
    }

    public static int isEndOfGame(char sign) {
        boolean rows = checkRow(sign);
        boolean columns = checkColumn(sign);
        boolean mainDiagonal = checkMainDiagonal(sign);
        boolean diagonal = checkDiagonal(sign);
        return  (rows || columns || mainDiagonal || diagonal) ? (sign == DOT_X ? 1 : 2) : 0;
    };

    public static boolean checkRow(char sign) {
        for (int i = 0; i < map.length; i++) {
            int counter = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == sign) {
                    counter++;
                }
            }
            if (counter == map[i].length) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumn(char sign) {
        for (int i = 0; i < map.length; i++) {
            int counter = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[j][i] == sign) {
                    counter++;
                }
            }
            if (counter == map[i].length) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkMainDiagonal(char sign) {
        for (int i = 0; i < map.length; i++) {
            if (map[i][i] != sign) return false;
        }
        return true;
    }

    public static boolean checkDiagonal(char sign) {
        for (int i = 0; i < map.length; i++) {
            if (map[i][SIZE - 1 - i] != sign) return false;
        }
        return true;
    }

    public static boolean isValidCoords( int x, int y) {
        if (x < 0 || x > SIZE - 1 || y < 0 || y > SIZE - 1) {
            changeFirstInput(false);
            return false;
        }
        if (map[x][y] != DOT_EMPTY) {
            changeFirstInput(false);
            return false;
        }
        return  true;
    }

    public static void changeFirstInput(boolean value) {
        firstInput = value;
    }

}


