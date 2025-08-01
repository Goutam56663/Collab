import java.util.*;
class Three_digit
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number..");
        int n = sc.nextInt();
        
        if((n>=100 && n<=999) || (n<=-100 && n>=-999))
        {
          if(n%3==0)
          {
              System.out.println("The entered number is a 3-digit number and it is divisible by 3");
          } 
          else
          {
              System.out.println("The entered number is a 3-digit number and it isn't divisible by 3");
          }
        }
        else
        {
            System.out.println("The entered number isn't a 3-digit number");
        }
    }
}
        