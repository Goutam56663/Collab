import java.util.Scanner;

class Taximeter
{
    int taxino;
    String name;
    int km;
    double bill;

    Taximeter() 
    {
        taxino = 0;
        name = "";
        km = 0;
        bill = 0.0;
    }

    void getdata() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Taxi Number: ");
        taxino = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Passenger Name: ");
        name = sc.nextLine();
        System.out.print("Enter Kilometers Travelled: ");
        km = sc.nextInt();
    }

    void calculate() 
    {
        if (km <= 1)
            bill = 20;
        else if (km <= 6)
            bill = 20 + (km - 1) * 10;
        else if (km <= 12)
            bill = 20 + 5 * 10 + (km - 6) * 15;
        else if (km <= 18)
            bill = 20 + 5 * 10 + 6 * 15 + (km - 12) * 20;
        else
            bill = 20 + 5 * 10 + 6 * 15 + 6 * 20 + (km - 18) * 25;
    }

    void display() 
    {
        System.out.println("Taxi No\tName\tKilometers\tBill Amount");
        System.out.println(taxino + "\t" + name + "\t" + km + "\t\t" + bill);
    }

    public static void main() 
    {
        Taximeter t = new Taximeter();
        t.getdata();
        t.calculate();
        t.display();
    }
}
