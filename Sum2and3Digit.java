import java.util.Scanner;

class Sum2and3Digit 
{
   void main()
   {

        Scanner sc = new Scanner(System.in);
        int sum2 = 0, sum3 = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n >= 10 && n <= 99)
                sum2 += n;
            else if (n >= 100 && n <= 999)
                sum3 += n;
        }

        System.out.println("Sum of 2-digit numbers = " + sum2);
        System.out.println("Sum of 3-digit numbers = " + sum3);
    }
}
