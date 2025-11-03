import java.util.Scanner;

class SumOf10 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++)
            sum += sc.nextInt();

        System.out.println("Sum = " + sum);
    }
}
