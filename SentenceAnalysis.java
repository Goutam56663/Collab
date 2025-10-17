import java.util.Scanner;

class SentenceAnalysis
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split("\\s+");
        System.out.println("Number of words: " + words.length);

        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (char ch : str.toCharArray()) 
        {
            switch (ch) 
            {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
            }
        }

        System.out.println("Vowel frequencies:");
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);
    }
}