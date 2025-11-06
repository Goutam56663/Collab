class SecondLargestDigit {
    void findSecondLargest(int n) {
        int largest = -1, secondLargest = -1;

        while (n > 0) {
            int d = n % 10;
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
            n /= 10;
        }

        if (secondLargest == -1)
            System.out.println("No second largest digit (all digits same)");
        else
            System.out.println("Second largest digit = " + secondLargest);
    }

    void main()
    {
        SecondLargestDigit ob = new SecondLargestDigit();
        ob.findSecondLargest(4765);
    }
}
