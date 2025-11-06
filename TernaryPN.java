import java.util.Scanner;

class TernaryPN
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n > 0) ? "Positive number" : (n < 0) ? "Negative number" : "Zero";
        System.out.println(result);
    }
}
