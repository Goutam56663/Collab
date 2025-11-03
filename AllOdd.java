import java.util.Scanner;

class AllOdd
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        boolean allOdd = true;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0)
                allOdd = false;
        }

        if (allOdd)
            System.out.println("All numbers are odd.");
        else
            System.out.println("All numbers are not odd.");
    }
}
