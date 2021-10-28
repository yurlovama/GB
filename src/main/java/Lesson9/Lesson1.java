package Lesson9;

//import Lesson8.*;


import Lesson8.Obstacle;
import Lesson8.Participant;

public class Lesson1 {
    public static void main(String[] args) {
        String[][] test = {{"q1", "28", "18"}, {"28", "45", "90"}, {"45","3", "4"}};
       try {
           checkLengthArray(test);
           checkArrayDataIsInt(test);
       } catch (Exception error) {
           System.out.print(error);
       }
    }

    public static void checkLengthArray(String[][] array) throws MyArraySizeException {

        if (array.length != 4 ) {
            throw new MyArraySizeException();
        }

    }
    public static void checkArrayDataIsInt(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                try {
                    int current=Integer.parseInt(array[i][j]);
                    sum = sum + current;
                } catch(Exception e) {
                    throw new MyArrayDataException("in cell" + "[" + i + "," + j + "] - " + array[i][j] + " is wrong");
                }
            }
        }
        System.out.println(sum);
    }
}
