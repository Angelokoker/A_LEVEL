package ua.syromiatnikov.hw4;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] initialArray = new int[400];
        fillingArray(initialArray);
        int[] copiedArray = Arrays.copyOf(initialArray, initialArray.length);
        getArithmeticMean(copiedArray);
        getGeometricMean(copiedArray);
        System.out.println(Arrays.toString(copiedArray));
        System.out.println(getArithmeticMean(copiedArray));
        System.out.println(getGeometricMean(copiedArray));

    }

    public static int[] fillingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 11 );
        }
        return array;
    }

    public static double getArithmeticMean(int[] array) {
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = sum / array.length;
        }
        return average;
    }

    public static double getGeometricMean(int[] array) {
        double average = 0;
        double sum = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = Math.sqrt(sum);
        }
        return average;
    }
}
