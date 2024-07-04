package Day4_7.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ex1 {
    public static void main(String[] args) {
        List<Double> listNumber = new ArrayList<>();
        listNumber.add(1.0);
        listNumber.add(2.0);
        listNumber.add(3.5);
        listNumber.add(4.3);
        listNumber.add(0.0);

        Consumer<List<Double>> consumer = numbers -> {
            numbers.parallelStream().mapToDouble(Double::doubleValue).average().ifPresent(System.out::println);
        };

        consumer.accept(listNumber);
    }
}
