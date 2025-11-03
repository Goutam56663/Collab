import java.util.Scanner;

class CountFactors 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;

        System.out.println("Number of factors = " + count);
    }
}