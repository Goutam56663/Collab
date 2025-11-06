import java.util.Scanner;

class FourDigitSum 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n >= 1000 && n <= 9999) 
        {
            int last = n % 10;
            int first = n / 1000;
            int sum = first + last;
            System.out.println("Sum of the first and last digit: " + sum);
        } 
        else 
        {
            System.out.println("Not a 4-digit number");
        }
    }
}
