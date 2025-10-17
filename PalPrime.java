class PalPrime {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        System.out.println("Three-digit Pal-Prime numbers:");
        for (int i = 100; i <= 999; i++) {
            if (isPrime(i) && isPalindrome(i))
                System.out.print(i + " ");
        }
    }
}
