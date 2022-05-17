package thirdHomework;

import java.util.Arrays;

public class Lesson32 {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        String string = Arrays.toString(myIntArray);  // приведенте массива к строчке
        System.out.println(string);
        workWithArray(myIntArray);
        string = Arrays.toString(myIntArray);
        System.out.println(string);
        System.out.println(myIntArray);

    }

    public static void workWithArray(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = i;
        }

    }

}