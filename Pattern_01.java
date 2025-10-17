class Pattern_01
{
    void main() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 5; j >= i; j--)
                System.out.print(j + " ");
                
            for (int k = 2; k <= i; k++)
                System.out.print(i + " ");
                
            System.out.println();
        }
}
}