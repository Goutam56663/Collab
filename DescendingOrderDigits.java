import java.util.Scanner;
class DescendingOrderDigits 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int prev = -1;
        boolean descending = true;

        while (n > 0) 
        {
            int d = n % 10;
            if (d < prev) 
            {
                descending = false;
                break;
            }
            prev = d;
            n /= 10;
        }

        if (descending)
            System.out.println("Digits are in descending order.");
        else
            System.out.println("Digits are not in descending order.");
    }
}