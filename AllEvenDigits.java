import java.util.Scanner;
class AllEvenDigits 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean allEven = true;
        while (n > 0) 
        {
            int d = n % 10;
            if (d % 2 != 0) 
            {
                allEven = false;
                break;
            }
            n /= 10;
        }

        if (allEven)
            System.out.println("All digits are even.");
        else
            System.out.println("All digits are not even.");
    }
}
