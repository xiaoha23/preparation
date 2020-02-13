package FactorialExample;

public class Solution {
    public static void main (String[] arg) {
        System.out.println(new Solution().factorial(5));
    }

    public int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
