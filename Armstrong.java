
public class Armstrong
{ 
    void main(int n)
    {
       int og = n;
       int rev=0;
       double sum=0;
       double pow=0;
       
       while( n>0)
       {
           rev = n%10;
           pow = Math.pow(rev,3);
           sum = sum+pow;
           n = n/10;
           
       }
       
       if(og==sum)
       {
           System.out.println(" The no. is armstrong no. ");
       }
       else
       {
           System.out.println(" The no. is not armstrong no. ");
           
       }
    }
}