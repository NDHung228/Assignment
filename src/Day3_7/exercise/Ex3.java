package Day3_7.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Ex3 {
    public static <Optional> void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>(Arrays.asList(1, 7, 18, 25, 77, 300, 101));
        listNumber.add(1);
        listNumber.add(1);
        listNumber.add(1);
        listNumber.add(1);

        List<Integer> newList = new ArrayList<>();

        listNumber.sort(Integer::compare);
        newList.add(listNumber.get(0));
        newList.add(listNumber.get(listNumber.get(listNumber.size() - 1)));


        newList.forEach(System.out::println);
    }
}
