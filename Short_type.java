import java.util.*;
class Short_type
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a short type");
        short mn = sc.nextShort();
        
        if(mn%2==0)
        System.out.println("Even Number");
        else
        System.out.println("Odd Number");
    }
}