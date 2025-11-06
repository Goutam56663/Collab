import java.util.Scanner;

class HarshadNumber 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n, sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (n % sum == 0)
            System.out.println(n + " is a Harshad (Niven) number.");
        else
            System.out.println(n + " is not a Harshad number.");
    }
}
