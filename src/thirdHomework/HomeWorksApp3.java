package thirdHomework;

import java.util.Arrays;

public class HomeWorksApp3 {
    public static void main(String[] args) {
        int[] myIntArray;
        myIntArray = new int[100];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i + 1;
            System.out.println(i);


        }
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        replaceZeroWithOne(array);
        System.out.println(Arrays.toString(array));
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array2));
        numbersLessThanSix(array2);
        System.out.println(Arrays.toString(array2));


    }

    public static void replaceZeroWithOne(int[] replaceArray) {
        for (int i = 0; i < replaceArray.length; i++) {
            if (replaceArray[i] == 1) {
                replaceArray[i] = 0;
            } else {
                replaceArray[i] = 1;
            }

        }
    }

    public static void numbersLessThanSix(int[] replaceArray) {
        for (int i = 0; i < replaceArray.length; i++) {
            if (replaceArray[i] < 6) {
                replaceArray[i] *= 2;
            }
        }
    }

    public static int[] returningAOneDimensionalArray(int initialValue, int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;

    }


}












