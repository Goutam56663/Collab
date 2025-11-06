import java.util.Scanner;

class BuzzNumbers 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p: ");
        int p = sc.nextInt();
        System.out.print("Enter q: ");
        int q = sc.nextInt();

        System.out.println("Buzz numbers between " + p + " and " + q + ":");
        for (int i = p; i <= q; i++)
            if (i % 10 == 7 || i % 7 == 0)
                System.out.print(i + " ");
    }
}
