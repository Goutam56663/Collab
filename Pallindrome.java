public class Pallindrome
{
    public void main(int n)
    {
         int rev=0;
         int og = n;
         int digit =0;
         
         while(n>0)
         {
             digit = n%10;
             rev = rev*10 + digit;
             n = n/10;
         }
         
         System.out.println(og);
         System.out.println(rev);
    }
}