import java.util.Scanner;
class Armstrong
{
    boolean isArmstrong(int n) 
    {
        int sum = 0; int temp = n;
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
            System.out.println("The number given above is an Armstrong number.");
        else
            System.out.println("The number given above isn't an Armstrong number.");
    }
}
