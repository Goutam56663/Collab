import java.util.Scanner;

class SumEvenOnly 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0)
                sum += n;
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}
