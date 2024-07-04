package Day4_7.exercise;

import java.util.ArrayList;
import java.util.List;


public class Ex3 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(7);
        listNumber.add(25);
        listNumber.add(77);
        listNumber.add(101);
        listNumber.add(18);
        listNumber.add(300);

        List<Integer> newList = new ArrayList<>();
        listNumber.sort(Integer::compare);

        try {
            newList.add(listNumber.get(0));
            newList.add(listNumber.get(listNumber.size()-2));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        newList.forEach(System.out::println);
    }
}
