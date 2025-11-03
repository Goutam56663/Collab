import java.util.Scanner;

class Factors 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.print("Factors: ");
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.print(i + " ");
    }
}
