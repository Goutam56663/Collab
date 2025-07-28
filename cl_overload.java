class cl_overload
{
    void area (int s)
    {
        int sr = s*s;
        System.out.println("The area of the square is" +sr);
    }
    void area (double r)
    {
        double ar = 3.14*r*r;
        System.out.println("The area of the circle is" +ar);
    }
    void area (int l, int b)
    {
        int ae = l*b;
         System.out.println("The area of the rectangle is" +ae);
    }
}