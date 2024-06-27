package Day27_6;



public class Ex1 {

    public static void change0ToEndArray(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0,j = 0; i < list.length; i++) {
            if(list[i] != 0) {
                result[j++] = list[i];
            }
        }

        for(int i: result) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] list = {0,0,1,0,3,0,5,0,6};
//        list = new int[]{0, 1, 1, 0, 3, 0, 5, 0, 6};
        change0ToEndArray(list);
    }
}
