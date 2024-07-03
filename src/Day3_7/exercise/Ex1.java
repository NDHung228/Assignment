package Day3_7.exercise;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {

        Predicate<Integer> isPrime = (number2) -> {
            if (number2 <= 1) {
                return false;
            }
            for (int j = 2; j <= Math.sqrt(number2); j++) {
                if (number2 % j == 0) {
                    return false;
                }
            }
            return true;
        };

        Consumer<Integer> result = number -> {
            int maxPrimeFactor = -1;

            // Kiểm tra ước số 2
            while (number % 2 == 0) {
                maxPrimeFactor = 2;
                number /= 2;
            }

            // Kiểm tra các ước số lẻ từ 3 trở lên
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                while (number % i == 0) {
                    if (isPrime.test(i)) {
                        maxPrimeFactor = i;
                    }
                    number /= i;
                }
            }

            // Trường hợp số còn lại lớn hơn 2 và là số nguyên tố
            if (number > 2 && isPrime.test(number)) {
                maxPrimeFactor = number;
            }

            System.out.println(maxPrimeFactor);
        };

        result.accept(176);
        result.accept(36);
        result.accept(7);

    }
}
