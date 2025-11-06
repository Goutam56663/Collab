import java.util.Scanner;

class LargestOfThreeTernary 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number = " + largest);
    }
}
