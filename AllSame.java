import java.util.Scanner;

class AllSame 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int first = sc.nextInt();
        boolean same = true;

        for (int i = 2; i <= 10; i++) 
        {
            int n = sc.nextInt();
            if (n != first)
                same = false;
        }

        if (same)
            System.out.println("All numbers are same.");
        else
            System.out.println("All numbers are not same.");
    }
}
