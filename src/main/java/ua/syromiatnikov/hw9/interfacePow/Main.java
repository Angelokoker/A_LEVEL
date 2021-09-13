package ua.syromiatnikov.hw9.interfacePow;

public class Main {
    public static void main(String[] args) {
    Pow pow = (number, pow1) -> {
        int result = 1;
        for (int i = 0; i < pow1; i++) {
            result *= number;
        }
        return result;
    };
      System.out.println(pow.pow(5, 2));
}
}