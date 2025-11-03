import java.util.Scanner;

class LargestOf10 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n > largest)
                largest = n;
        }

        System.out.println("Largest number = " + largest);
    }
}
