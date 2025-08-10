class two_vs_three
{
    void main(int n)
    {
        if((n>=10 && n<=99) || (n<=-10 && n>=-99))
        {
            System.out.println(" 2-digit number. ");
        }
        else if ((n>=100 && n<=999) || (n<=-100 && n>=-999))
        {
            System.out.println(" 3-digit number. ");
        }
        else
        {
            System.out.println(" Not 2 or 3 digit number");   
        }
    }
}