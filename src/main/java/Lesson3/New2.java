package Lesson3;

public class New2 {

    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1, 0, 1, 1, 0};
        int[] changeArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1 };
        int[] checkBalance = {2, 2, 2, 1, 6, 2, 10, 1};
        int[] checkBalance1 = {1, 1, 1, 2, 1, 1,1,1,10};
        int[] shiftArray = {1,2,3};
        oneToZero(array);
        hundred(100);
        changeArray(changeArray, 6);
        fillDiagonal(8);
        createArrayWithValue(5, 2);
            minMax(changeArray);
        checkBalance(checkBalance1);
        shiftArray(shiftArray, 2);

    }

    public static void oneToZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        printArray(array);
    }

    public static int[] hundred(int value) {
        int[] arr = new int[value];
        for (int i = 0; i < value; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);
        return arr;
    }
    public static int[] changeArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < value) {
                array[i] = array[i] * 2;
            }
        }
        printArray(array);
        return array;
    }
    public static int[][] fillDiagonal(int value) {
        int[][] arr = new int[value][value];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == value - i - 1 ) {
                    arr[i][j] = 1;
                }
            }
        }
        printMatrix(arr);
        return arr;
    }

    public static int[] createArrayWithValue(int length, int initialValue) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        printArray(array);
        return array;
    }

    public static int[] minMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int [] result = new int[] {min, max};
        printArray(result);
        return result;
    }

    public static boolean checkBalance(int[] array) {
        int leftSum = 0;
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            int j = array.length - 1;
            while ( j != 0 ) {
                rightSum += array[j];
                if (rightSum == leftSum) {
                    result = true;
                    j = 1;
                }
                j--;
            }
        }

        System.out.println(result);
        return result;
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int c = a;
            a = b;
            b = c % a;
        }
        return a;
    }

    public static int[] shiftArray(int[] array, int shift) {

        shift %= array.length;

        if(shift < 0)
            shift = array.length + shift;
        int d = gcd(array.length, shift);
        for(int i = 0; i < d; i++) {
            int temp = array[i];
            for(int j = i - shift + array.length; j != i; j = (j - shift + array.length) % array.length)
                array[(j + shift) % array.length] = array[j];
            array[i + shift] = temp;
        }
        printArray(array);
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}


