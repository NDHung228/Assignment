package test.lamdba;

import java.util.Arrays;
import java.util.List;

// Lambda without parameters
interface Sayable {
    String say();
}

// Lambda with parameter
interface Sayable2 {
    String say(String s);
}

public class Lambdas {

    public static void main(String[] args) {

        // Lambda without parameters
        Sayable s = () -> {
            return "Hello";
        };
        System.out.println(s.say());

        Sayable s1 = () -> "Hello1";
        System.out.println(s1.say());

        // Lambda with parameters
        Sayable2 s2 = name -> "Hello " + name;
        System.out.println(s2.say("Name1"));

        Sayable2 s3 = (name) -> "Hello " + name;
        System.out.println(s3.say("Name2"));

        Sayable2 s4 = (name) -> {
            System.out.println("This is inside body of lamdba");
            return "Hello " + name;
        };

        System.out.println(s4.say("Name3"));

        List<String> languages = Arrays.asList("java", "python", "c", "c#", "c++");

        languages.forEach(System.out::print);

    }
}
