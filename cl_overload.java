class cl_overload
{
    void area (int s)
    {
        int ar = s*s;
        System.out.println("The area of the square is" +ar);
    }
    void area (double r)
    {
        double ar = 3.14*r*r;
        System.out.println("The area of the circle is" +ar);
    }
    void area (int l, int b)
    {
        int ar = l*b;
         System.out.println("The area of the rectangle is" +ar);
    }
    
    void main ()
    {
        int k = 2, a = 7, b = 4;
        double p = 2.32;
        area (k);
        area (p);
        area (a,b);
        
    }
}