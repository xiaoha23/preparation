package fibonacciSeries;

public class FibonacciExample {

    public int fib(int n) throws Exception {
        if (n < 1)
            return -1;
        else if(n == 1 || n == 2)
            return n -1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new FibonacciExample().fib(10));
    }
}
