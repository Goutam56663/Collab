import java.util.Scanner;

class TernaryEvenOdd 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(result);
    }
}