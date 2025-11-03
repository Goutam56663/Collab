import java.util.Scanner;

class LargestSmallest 
{
        void main()
        {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n > largest)
                largest = n;
            if (n < smallest)
                smallest = n;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
