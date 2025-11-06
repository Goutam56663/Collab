class SumOfDigits 
{
    void findSum(int n) 
    {
        int sum = 0;
        while (n > 0) 
        {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }

    void main()
    {
        SumOfDigits ob = new SumOfDigits();
        ob.findSum(1234);   
    }
}
