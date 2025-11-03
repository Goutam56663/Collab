import java.util.Scanner;

class LargestEven 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int largestEven = Integer.MIN_VALUE;
        boolean found = false;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                found = true;
                if (n > largestEven)
                    largestEven = n;
            }
        }

        if (found)
            System.out.println("Largest even integer = " + largestEven);
        else
            System.out.println("No even integer found.");
    }
}
