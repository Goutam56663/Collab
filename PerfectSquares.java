import java.util.Scanner;

class PerfectSquares 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Perfect squares between " + m + " and " + n + ":");
        for (int i = m; i <= n; i++) {
            int sq = (int) Math.sqrt(i);
            if (sq * sq == i)
                System.out.print(i + " ");
        }
    }
}
