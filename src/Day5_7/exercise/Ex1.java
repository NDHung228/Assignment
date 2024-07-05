package Day5_7.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);

        System.out.println(list.stream()
                .filter(num -> num % 2 == 0)
                .reduce( Integer::sum).orElse(0));

        System.out.println(list.stream()
                .filter(num -> num % 2 != 0)
                .reduce(0, Integer::sum));

        System.out.println(list.stream().filter(num -> num % 2 == 0).mapToInt(num -> num).sum());
    }
}
