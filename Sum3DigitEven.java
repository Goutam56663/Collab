class Sum3DigitEven 
{
    void main()
    {
        int sum = 0;
        for (int i = 100; i <= 998; i += 2)
            sum += i;
        System.out.println("Sum of all 3-digit even natural numbers = " + sum);
    }
}
