import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double d = b * b - 4 * a * c;
        System.out.println("Discriminant = " + d);

        if (d == 0)
            System.out.println("Roots are real and equal: " + (-b / (2 * a)));
        else if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct: " + r1 + ", " + r2);
        } else
            System.out.println("Roots are imaginary and cannot be calculated.");
    }
}
