package ua.syromiatnikov.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        fillArrayDesk(array);
        int[][] CopiedMatrix = Arrays.copyOf(array, array.length);
        fillNegativeNumbers(CopiedMatrix);

        for (int[] InnerArray : array) {
            System.out.println(Arrays.toString(InnerArray));
        }
    }

    private static void fillNegativeNumbers(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ( i % 2 == 0 ) ? count : -count;
                count++;

            }
        }
        return;
    }


    private static int[][] fillArrayDesk(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
        return array;
    }
}