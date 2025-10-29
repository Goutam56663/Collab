class SmithNumbers {
    int sumOfDigits(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

     boolean isPrime(int n) {
        if (n < 2) 
        return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) 
            return false;
        return true;
    }

    boolean isSmith(int n) {
        if (isPrime(n)) return false;
        int temp = n, sum = sumOfDigits(n), factSum = 0;
        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                factSum += sumOfDigits(i);
                temp /= i;
            }
        }
        return sum == factSum;
    }

    void main() {
        System.out.println("Smith Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++)
            if (isSmith(i))
                System.out.print(i + " ");
    }
}
