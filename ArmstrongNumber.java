import java.util.Scanner;

class ArmstrongNumber {
    void checkArmstrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        new ArmstrongNumber().checkArmstrong(num);
    }
}
