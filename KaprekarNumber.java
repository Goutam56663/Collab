import java.util.Scanner;

class KaprekarNumber {
    boolean isKaprekar(int n) {
        long sq = (long) n * n;
        String s = Long.toString(sq);
        int d = String.valueOf(n).length();

        String right = s.substring(s.length() - d);
        String left = (s.length() == d) ? "0" : s.substring(0, s.length() - d);

        int rightNum = Integer.parseInt(right);
        int leftNum = Integer.parseInt(left);

        return (rightNum + leftNum) == n;
    }

    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isKaprekar(n))
            System.out.println(n + " is a Kaprekar number.");
        else
            System.out.println(n + " is not a Kaprekar number.");
    }
}
