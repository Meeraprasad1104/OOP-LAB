import  java.util.*;
class shape
{
    float area(float a)
    {
        return(a*a);
    }
    float  area(float l, float b)
    {
        return(l*b);
    }
    double  area(double r)
    {
        return(3.14*r*r);
    }
}
class overload
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        float a,l,b;
        double r;

        shape s1=new shape();

        System.out.println("enter the side of a square=");
        a=sc.nextFloat();
        System.out.println(s1.area(a));

        System.out.println("length of a rectangle=");
        l=sc.nextFloat();
        System.out.println("breadth of a rectangle=");
        b=sc.nextFloat();
        System.out.println(s1.area(l,b));

        System.out.println("radius of a circle=");
        r=sc.nextDouble();
        System.out.println(s1.area(r));
    }
}