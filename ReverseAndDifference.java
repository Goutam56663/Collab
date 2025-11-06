import java.util.Scanner;

class ReverseAndDifference
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0, temp = n;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Reversed number: " + rev);
        System.out.println("Absolute difference: " + Math.abs(n - rev));
    }
}
