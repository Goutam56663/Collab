class cl_overloading
{
    void volume (int s)
    {
        int ar = s*s*s;
        System.out.println("The volume of the cube is " +ar);
    }
    void volume (double r)
    {
        double ar = (double) (4/3)*Math.PI*r*r*r;
        System.out.println("The volume of the sphere is " +ar);
    }
    void volume (int l, int b, int h)
    {
        int ar = l*b*h;
        System.out.println("The volume of the cuboid is " +ar);
    }
    void volume (int r, double h)
    {
        double v =(double) Math.PI*r*r*h;
        System.out.println("The volume of the cylinder is " +v);
    }
    
    void main ()
    {
        int k = 2, a = 7, b = 4;
        double p = 2.32;
        volume (k);
        volume (p);
        volume (a,b);
        
    }
}