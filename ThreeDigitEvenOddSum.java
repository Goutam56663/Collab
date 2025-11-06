import java.util.Scanner;

class ThreeDigitEvenOddSum 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n >= 100 && n <= 999) 
        {
            int last = n % 10;
            int first = n / 100;
            int sum = first + last;
            if (sum % 2 == 0)
                System.out.println("Sum of the first and last digit is an even number");
            else
                System.out.println("Sum of the first and last digit is an odd number");
        } 
        else 
        {
            System.out.println("Not a 3-digit number");
        }
    }
}
