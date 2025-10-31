import java.util.*;
class AscendingDigits 
{
    void arrangeAscending(int n) 
    {
        int[] digits = new int[10];
        int i = 0;
        while (n > 0) 
        {
            digits[i++] = n % 10;
            n /= 10;
        }
        Arrays.sort(digits, 0, i);

        System.out.print("Number in ascending order: ");
        for (int j = 0; j < i; j++)
            System.out.print(digits[j]);
    }

    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        arrangeAscending(num);
    }
}
