package ua.syromiatnikov.hw3;

public class Task1 {
        public static void main(String[] args) {
            System.out.println(isPolindrome("ABBA CCCC ABba"));
            System.out.println(isPolindrome("ABBA 2345 AB':ba"));
            System.out.println(isPolindrome("ABcvvbA 2345 Abba"));
            System.out.println(isPolindrome("Hello My Bro!"));

        }
        public static boolean isPolindrome(String text) {
            String s1 = text.toUpperCase().replaceAll("[^A-Za-z]", "");
            StringBuffer s2 = new StringBuffer(s1).reverse();
            boolean answer = true;
            for(int count = 0; count < s1.length(); count++) {
                if(s1.charAt(count)!=s2.charAt(count))
                    answer = false;
                break;
            }
            return true;
        }
    }
