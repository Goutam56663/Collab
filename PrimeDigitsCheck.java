import java.util.Scanner;
class PrimeDigitsCheck 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean allPrime = true;
        while (n > 0) 
        {
            int d = n % 10;
            if (!(d == 2 || d == 3 || d == 5 || d == 7)) 
            {
                allPrime = false;
                break;
            }
            n /= 10;
        }

        if (allPrime)
            System.out.println("All digits are prime digits.");
        else
            System.out.println("All digits aren't prime digits.");
    }
}