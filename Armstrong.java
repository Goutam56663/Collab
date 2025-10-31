import java.util.Scanner;
class Armstrong
{
    static boolean isArmstrong(int n) 
    {
        int sum = 0, temp = n;
        while (temp > 0) 
        {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        return sum == n;
    }

    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
