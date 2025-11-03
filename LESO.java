import java.util.Scanner;

class LESO 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int largestEven = Integer.MIN_VALUE, smallestOdd = Integer.MAX_VALUE;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0 && n > largestEven)
                largestEven = n;
            if (n % 2 != 0 && n < smallestOdd)
                smallestOdd = n;
        }

        System.out.println("Largest even = " + largestEven);
        System.out.println("Smallest odd = " + smallestOdd);
    }
}
