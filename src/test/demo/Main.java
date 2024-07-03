package test.demo;

import Day27_6.Ex3;

public class Main {
    public static int demo = 0;
    static void test() {
// Khối static được thực thi trước phương thức main
        System.out.println("Câu lệnh này chạy trước");
    }

    public static void main(String[] args) {
        System.out.println("Câu lệnh này chạy sau");
         Student student = new Student(1,1);


    }
}
