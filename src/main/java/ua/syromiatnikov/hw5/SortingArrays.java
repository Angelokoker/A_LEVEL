package ua.syromiatnikov.hw5;

import java.util.Arrays;
import java.util.Random;

class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = fillArrayDesk(3);
        System.out.println(Arrays.toString(numbers));
        System.out.println(sortingCheck(numbers));

    }

    public static int[] fillArrayDesk(int num) {
        int[] numbers = new int[num];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5);
        }
        return numbers;
    }

    public static boolean sortingCheck(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
