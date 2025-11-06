import java.util.Scanner;

class Library {
    int acc_num;
    String title;
    String author;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Accession Number: ");
        acc_num = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();
        double fine = days * 2.0;
        System.out.println("Fine: Rs. " + fine);
    }

    void display() {
        System.out.println("Accession Number\tTitle\tAuthor");
        System.out.println(acc_num + "\t" + title + "\t" + author);
    }

    void main() {
        Library l = new Library();
        l.input();
        l.compute();
        l.display();
    }
}
