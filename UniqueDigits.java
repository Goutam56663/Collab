import java.util.Scanner;
class UniqueDigits 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean[] seen = new boolean[10];
        boolean unique = true;

        while (n > 0) 
        {
            int d = n % 10;
            if (seen[d]) 
            {
                unique = false;
                break;
            }
            seen[d] = true;
            n /= 10;
        }

        if (unique)
            System.out.println("All digits are unique.");
        else
            System.out.println("Digits are not unique.");
    }
}
