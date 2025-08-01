class cl_overload_pat
{
    void pat(int s, char c)
    {
        int i, j;
        for(i=1; i<=s; i++)
        {
            for(j=1; j<=s; j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    void pat(int l, int b, char c)
    {
        int i, j;
        for(i=1; i<=l; i++)
        {
            for(j=1; j<=b; j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    void pat(char c, int s)
    {
        int i, j;
        for(i=1; i<=s; i++)
        {
            for(j=1; j<=s; j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}