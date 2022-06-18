
public class FibonacciNumbers {

    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        System.out.println(fibonacciNumbers.fibonacciRecursive(0));
        System.out.println(fibonacciNumbers.fibonacciRecursive(1));
        System.out.println(fibonacciNumbers.fibonacciRecursive(2));
        System.out.println(fibonacciNumbers.fibonacciRecursive(3));
        System.out.println(fibonacciNumbers.fibonacciRecursive(4));
        System.out.println(fibonacciNumbers.fibonacci(4));
    }


    //We are using recursion to compute fibonacci of n
    //but this approach is very slow because we have to
    //calculate the same fibonacci over and over again.
    private int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;

        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }


    private int fibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        int sum = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            sum += arr[i];
        }
        return sum;
    }
}
