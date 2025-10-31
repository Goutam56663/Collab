import java.util.Scanner;
class AllDigitsSame
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int last = n % 10;
        boolean same = true;

        while (n > 0)
        {
            if (n % 10 != last)
            {
                same = false;
                break;
            }
            n /= 10;
        }

        if (same)
            System.out.println("All digits are the same.");
        else
            System.out.println("Digits are not the same.");
    }
}
