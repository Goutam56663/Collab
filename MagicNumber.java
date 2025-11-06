import java.util.Scanner;

class MagicNumber 
{
    int sumOfDigits(int n) 
    {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;

        while (temp > 9)
            temp = sumOfDigits(temp);

        if (temp == 1)
            System.out.println(n + " is a Magic number.");
        else
            System.out.println(n + " is not a Magic number.");
    }
}
