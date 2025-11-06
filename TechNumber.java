class TechNumber
{
    void main() 
    {
        for (int n = 1000; n <= 9999; n++) {
            int first = n / 100;
            int second = n % 100;
            int sum = first + second;
            if (sum * sum == n)
                System.out.println(n + " is a Tech number.");
        }
    }
}
