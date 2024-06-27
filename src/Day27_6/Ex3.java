package Day27_6;

public class Ex3 {

    static int getFirstNumber(int number) {
        String numberString = String.valueOf(number);
        String result;

        if (number >= 0) {

            result = String.valueOf(numberString.charAt(0)) ;
        } else {
            result =  "-" + String.valueOf(numberString.charAt(1)) ;
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(getFirstNumber(1234)
        );
        System.out.println(getFirstNumber(-5234)
        );
    }
}
