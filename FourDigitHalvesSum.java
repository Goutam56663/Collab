import java.util.Scanner;

class FourDigitHalvesSum 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n >= 1000 && n <= 9999) 
        {
            int firstHalf = n / 100;   
            int secondHalf = n % 100;  
            int sum = firstHalf + secondHalf;
            System.out.println("Sum of the two halves: " + sum);
        } 
        else 
        {
            System.out.println("Not a 4-digit number");
        }
    }
}
