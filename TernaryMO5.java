import java.util.Scanner;

class TernaryMO5
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n % 5 == 0) ? "Multiple of 5" : "Not a multiple of 5";
        System.out.println(result);
    }
}
