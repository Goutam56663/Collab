import java.util.Scanner;

class IncomeTax 
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();
        System.out.print("Enter taxable income: ");
        double income = sc.nextDouble();

        if (age > 65 || gender.equals("female")) {
            System.out.println("Wrong category");
        } else {
            double tax = 0;
            if (income <= 160000)
                tax = 0;
            else if (income <= 500000)
                tax = (income - 160000) * 0.10;
            else if (income <= 800000)
                tax = (income - 500000) * 0.20 + 34000;
            else
                tax = (income - 800000) * 0.30 + 94000;

            System.out.println("Income Tax Payable = Rs. " + tax);
        }
    }
}
