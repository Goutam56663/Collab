import java.util.Scanner;

class TemperatureConversion 
{
    void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Conversion Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = sc.nextDouble();
                double c = (5.0 / 9) * (f - 32);
                System.out.println("Temperature in Celsius = " + c);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                double c2 = sc.nextDouble();
                double f2 = 1.8 * c2 + 32;
                System.out.println("Temperature in Fahrenheit = " + f2);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}