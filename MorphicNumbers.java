import java.util.Scanner;

class MorphicNumbers {
    boolean endsWith(int num, int end) {
        String nStr = String.valueOf(num);
        String eStr = String.valueOf(end);
        return nStr.endsWith(eStr);
    }

    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean auto = endsWith(n * n, n);
        boolean tri = endsWith(n * n * n, n);
        boolean triauto = endsWith(3 * n * n * n, n);

        if (auto)
            System.out.println(n + " is Automorphic.");
        if (tri)
            System.out.println(n + " is Trimorphic.");
        if (triauto)
            System.out.println(n + " is Tri-Automorphic.");
        if (!auto && !tri && !triauto)
            System.out.println(n + " is not any of the three.");
    }
}
