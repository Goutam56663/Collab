import java.util.Scanner;

class EvenSumElseProduct 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = (a % 2 == 0 && b % 2 == 0) ? (a + b) : (a * b);
        System.out.println("Result = " + result);
    }
}
