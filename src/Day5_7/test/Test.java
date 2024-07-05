package Day5_7.test;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {

        Optional<Double> optionalValue = Optional.of(3.0);
        Optional<Double> optionalEmptyValue = Optional.empty();

        // Kiểm tra giá trị có mặt hay không
        if (optionalValue.isPresent()) {
            System.out.println("Có giá trị: " + optionalValue.get()); // Output: Có giá trị: Hello, Optional!
        }

        // Sử dụng ifPresent
        optionalValue.ifPresent(value -> System.out.println("Có giá trị sử dụng ifPresent: " + value)); // Output: Có giá trị sử dụng ifPresent: Hello, Optional!

        // Kiểm tra Optional trống
       // Output: optionalEmpty có giá trị: false

        optionalEmptyValue.ifPresent(value -> {

            System.out.println("optionalEmpty có giá trị: " + value);
            System.out.println("demo");
        });

        optionalEmptyValue.ifPresent(value -> {
            System.out.println("optionalEmpty có giá trị: " + value);
            System.out.println("demo");
        });
    }
}
