package Day2_7.test.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    public static void printArrayTest(List<?> array) {
        for (Object element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D"};

        Box<Object> box = new Box<>();
        box.setItem( "123");
        System.out.println(box.getItem());

        box.setItem( 123);
        System.out.println(box.getItem());



        printArray(intArray); // Output: 1 2 3 4 5
        printArray(stringArray); // Output: A B C D
    }
}
