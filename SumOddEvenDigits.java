class SumOddEvenDigits 
{
    void findSum(int n) 
    {
        int sumOdd = 0, sumEven = 0;
        while (n > 0) 
        {
            int d = n % 10;
            if (d % 2 == 0)
                sumEven += d;
            else
                sumOdd += d;
            n /= 10;
        }
        System.out.println("Sum of even digits = " + sumEven);
        System.out.println("Sum of odd digits = " + sumOdd);
    }

    void main() 
    {
        SumOddEvenDigits ob = new SumOddEvenDigits();
        ob.findSum(1234);
    }
}
