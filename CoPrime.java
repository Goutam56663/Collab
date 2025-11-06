import java.util.Scanner;

class CoPrime 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }

        if (hcf == 1)
            System.out.println("They are co-prime numbers.");
        else
            System.out.println("They are not co-prime numbers.");
    }
}
