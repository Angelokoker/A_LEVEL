package ua.syromiatnikov.hw4;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] initialArray = new int[100];
        fillingArray(initialArray);
        int[] copiedArray = Arrays.copyOf(initialArray, initialArray.length);
        simpleNumber(initialArray);
        System.out.println(Arrays.toString(copiedArray));
        System.out.println(simpleNumber(copiedArray));
    }

    public static int[] fillingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 1001 );
        }
        return array;
    }

    public static int simpleNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean simpleNumber = true;
            if (array[i] < 2) {
                simpleNumber = false;
            } else {
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        simpleNumber = false;
                        break;
                    }
                }
            }
            if (simpleNumber) {
                count++;
            }
        }
        return count;
    }
}

