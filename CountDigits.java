import java.util.Scanner;

class CountDigits 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0, temp = n;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        System.out.println("Number of digits = " + count);
        if (count % 2 == 0)
            System.out.println("The number contains even number of digits.");
        else
            System.out.println("The number contains odd number of digits.");
    }
}
