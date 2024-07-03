package Day3_7.exercise;

import java.util.function.Function;

public class Ex2 {

    public static void main(String[] args) {

        Function<Integer,String> convertBinary = (number) -> {
            StringBuilder sb = new StringBuilder();

            while (number > 0){
                sb.append(number % 2);
                number /= 2;
            }
            return sb.reverse().toString();
        };

        System.out.println(convertBinary.apply(33));
        System.out.println(convertBinary.apply(747));

    }
}
