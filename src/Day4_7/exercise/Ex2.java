package Day4_7.exercise;

import java.util.function.Predicate;

public class Ex2 {
    public static void main(String[] args) {
        Predicate<StringBuilder> checkPalindrome = str -> {
            String temp = str.toString();
            return str.reverse().toString().contentEquals(temp);
        };

        System.out.println(checkPalindrome.test(new StringBuilder("Madam")));
        System.out.println(checkPalindrome.test(new StringBuilder("radar")));
        System.out.println(checkPalindrome.test(new StringBuilder("defied")));

    }
}
