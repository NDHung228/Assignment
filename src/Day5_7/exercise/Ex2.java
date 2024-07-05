package Day5_7.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,23,22,23,24,24,33,15,26,15));

        List<Integer> listDistinct = list.stream().distinct().collect(Collectors.toList());

        System.out.println(listDistinct);

    }
}
