import java.util.Scanner;
class AscendingOrderDigits 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int prev = 10;
        boolean ascending = true;

        while (n > 0) 
        {
            int d = n % 10;
            if (d > prev) 
            {
                ascending = false;
                break;
            }
            prev = d;
            n /= 10;
        }

        if (ascending)
            System.out.println("Digits are in ascending order.");
        else
            System.out.println("Digits are not in ascending order.");
    }
}
