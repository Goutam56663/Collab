public class NumberProcessor
{

    public static void processNumber(int number)
    {
        if (number > 120) 
        {
            int square = number * number;
            System.out.println("Square of " + number + " is: " + square);
        } 
        else 
        {
            int cube = number * number * number;
            System.out.println("Cube of " + number + " is: " + cube);
        }
    }
}
