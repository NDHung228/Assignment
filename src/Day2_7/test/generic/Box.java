package Day2_7.test.generic;

import java.util.ArrayList;
import java.util.List;


public class Box<T> {

    private T item;
    private int number;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        List<Integer> list = new ArrayList<>();
        integerBox.setItem(123);
        System.out.println("Integer Value: " + integerBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        System.out.println("String Value: " + stringBox.getItem());

    }
}
