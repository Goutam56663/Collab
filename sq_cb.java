import java.util.*;
class sq_cb
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double m = sc.nextDouble();
        int op = sc.nextInt();
        double sq = sc.nextDouble();
        double cb = sc.nextDouble();
        
        switch(op)
        {
            case 1:
            sq = m*m;    
            System.out.println("The Square is" +sq);
            
            case 2:
            cb = m*m*m;
            System.out.println("The Cube is" +cb);
        }
        
        
        if(sq>120)
        System.out.println(sq);
        else
        System.out.println(cb);
    }
}