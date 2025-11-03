import java.util.Scanner;

class AllEven 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        boolean allEven = true;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n % 2 != 0)
                allEven = false;
        }

        if (allEven)
            System.out.println("All numbers are even.");
        else
            System.out.println("All numbers are not even.");
    }
}
