class LargestSmallestDigit 
{
    void findDigits(int n) 
    {
        int largest = 0, smallest = 9;
        while (n > 0) {
            int d = n % 10;
            if (d > largest)
                largest = d;
            if (d < smallest)
                smallest = d;
            n /= 10;
        }
        System.out.println("Largest digit = " + largest);
        System.out.println("Smallest digit = " + smallest);
    }

    void main()
    {
        LargestSmallestDigit ob = new LargestSmallestDigit();
        ob.findDigits(4765);
    }
}
