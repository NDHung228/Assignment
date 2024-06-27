package Day27_6;

public class Ex2 {
    static boolean checkOdd(int n) {
        String stringNumber = String.valueOf(n);

        for (int i = 0, temp; i < stringNumber.length(); i++) {
            temp = stringNumber.charAt(i);
            if (temp % 2 == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkOdd(8642));
        System.out.println(checkOdd(3579));
        System.out.println(checkOdd(4567));

    }
}
