import java.util.Scanner;

class HappyNumber {
    static int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
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

        while (temp != 1 && temp != 4)
            temp = sumSquareDigits(temp);

        if (temp == 1)
            System.out.println(n + " is a Happy number.");
        else
            System.out.println(n + " is not a Happy number.");
    }
}
