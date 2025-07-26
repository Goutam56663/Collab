import java.lang.*;
public class SP_CP
{
    public void main(int SP, int CP)
    {
        int cal = SP-CP;
        if (cal > -1)
        System.out.println("The profit is " + Math.abs(cal));
        else
        System.out.println("The loss is " + Math.abs(cal));
        
        
    }
}