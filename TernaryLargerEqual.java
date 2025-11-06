import java.util.Scanner;

class TernaryLargerEqual 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        String result = (a > b) ? (a + " is larger") : (b > a ? b + " is larger" : "Equal");
        System.out.println(result);
    }
}