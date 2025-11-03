class Sum3DMulti5 
{
    void main()
    {
        int sum = 0;
        for (int i = 101; i <= 999; i += 2)
            if (i % 5 == 0)
                sum += i;
        System.out.println("Sum of all 3-digit odd multiples of 5 = " + sum);
    }
}