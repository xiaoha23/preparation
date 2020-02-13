package basicRecursion;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.foo(3);
    }

    public void foo(int n) {
        if (n < 1)
            return;
        else
            foo(n - 1);
        System.out.println("Hello " + n);
    }
}
