import java.util.*;
class invalid_entry
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER TWO NUMBERS..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == 0 || b == 0)
        System.out.println("INVALID ENTRY");
        else
        System.out.println("VALID ENTRY");
    }
} 