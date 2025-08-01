import java.util.*;
class Two_digit
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number..");
        int n = sc.nextInt();
        
        if((n>=10 && n<=99) || (n<=-10 && n>=-99))
        {
            System.out.println("The entered number is a 2-digit number");
        }
        else
        {
            System.out.println("The entered number isn't a 2-digit number");
        }
    }
}   