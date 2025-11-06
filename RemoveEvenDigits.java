import java.util.Scanner;

class RemoveEvenDigits {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int newNum = 0, place = 1;

        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) {
                newNum = d * place + newNum;
                place *= 10;
            }
            n /= 10;
        }

        System.out.println("Number after removing even digits: " + newNum);
    }
}
