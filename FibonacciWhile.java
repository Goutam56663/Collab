
public class FibonacciWhile {
    public  void main(int n) {
        ; // Upper limit
        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + ": ");

        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
