import java.util.Scanner;

class PalindromePerfect 
{
    boolean isPalindrome(int n) 
    {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return n == rev;
    }

    boolean isPerfect(int n) 
    {
        int sum = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                sum += i;
        return sum == n;
    }

    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Palindrome");
        System.out.println("2. Check Perfect Number");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (ch == 1)
            System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");
        else if (ch == 2)
            System.out.println(isPerfect(n) ? "Perfect Number" : "Not Perfect");
        else
            System.out.println("Invalid Choice");
    }
}
