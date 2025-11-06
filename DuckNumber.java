import java.util.Scanner;

class DuckNumber 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        if (num.charAt(0) == '0')
            System.out.println("Number should not begin with zero.");
        else if (num.contains("0"))
            System.out.println("It is a Duck number.");
        else
            System.out.println("It is not a Duck number.");
    }
}
