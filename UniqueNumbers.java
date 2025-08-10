import java.util.Scanner;
class UniqueNumbers 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        if (a != b && b != c && a != c) 
        System.out.println("All numbers are unique."); 
        else 
        System.out.println("Numbers are not unique.");
        }
    }