import java.util.Scanner;

class DudeneyNumber 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0, temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        int cube = (int) Math.cbrt(n);
        if (sum == cube)
            System.out.println(n + " is a Dudeney number.");
        else
            System.out.println(n + " is not a Dudeney number.");
    }
}
