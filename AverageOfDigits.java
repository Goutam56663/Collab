class AverageOfDigits 
{
    void findAverage(int n) 
    {
        int sum = 0, count = 0;
        int temp = n;
        while (temp > 0) 
        {
            sum += temp % 10;
            count++;
            temp /= 10;
        }
        double avg = (double) sum / count;
        System.out.println("Average of digits = " + avg);
    }

    void main()
    {
        AverageOfDigits ob = new AverageOfDigits();
        ob.findAverage(1234);
    }
}
