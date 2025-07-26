
public class Fibonacci
{
    void main(int n)
    {
        int a = 0;
        int b = 1;
        int c = 0;

        
        while(n >= c )
        {
            c = a+b;
            System.out.print(c + "," );
            a=b;
            b=c;
            
            
        }
    }
}