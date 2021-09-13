package ua.syromiatnikov.hw3;

import java.util.Scanner;

    public class Task2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите предложение: ");
            String input = scanner.nextLine();
            int count = 0;
            if (input.length() != 0) {
                count++;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == ' ') {
                        count++;
                    }
                }
            }
            System.out.println("Вы ввели " + count + " слов(а). ");
        }
    }
