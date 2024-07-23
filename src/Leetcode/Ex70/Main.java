package Leetcode.Ex70;

public class Main {

    public static int climbStairs(int n) {
        if(n == 1 || n ==0) return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
}
