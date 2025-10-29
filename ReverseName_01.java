import java.util.Scanner;
class ReverseName_01
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--)
            rev += name.charAt(i);

        System.out.println("Reversed Name: " + rev);
    }
}