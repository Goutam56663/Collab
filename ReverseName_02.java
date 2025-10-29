import java.util.Scanner;
class ReverseName_02
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER YOUR NAME:");
        String name = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        
        System.out.println("REVERSED NAME: " +sb);
    }
}    