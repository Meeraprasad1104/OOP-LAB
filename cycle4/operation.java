import arithametic.*;
import java.util.*;
public class operation implements arithametic.substraction,arithametic.division
{
    public float sub(float a,float b)
    {
        return(a-b);
    }
    public float div(float a,float b)
    {
        return(a/b);
    }
    public static void main(String arg[])
    {
        float a,b;
        Scanner in= new Scanner(System.in);
        addition d=new addition();
        multiplication m=new multiplication();
        operation o=new operation();

        System.out.println("\n\t\t\t\t ADDITION ");
        System.out.println("\t\t\t============================");
        System.out.print("\n\t\t Enter the first number = ");
        a=in.nextFloat();
        System.out.print("\n\t\t Enter the second number = ");
        b=in.nextFloat();
        System.out.print("\n\t\t addition of two numbers : " + d.add(a,b));

        System.out.println("\n\n\t\t\t\t SUBSTRACTION ");
        System.out.println("\t\t\t============================");
        System.out.print("\n\t\t Enter the first number = ");
        a=in.nextFloat();
        System.out.print("\n\t\t Enter the second number = ");
        b=in.nextFloat();
        System.out.print("\n\t\t substraction of two numbers : "+ o.sub(a,b));

        System.out.println("\n\n\t\t\t\t MULTIPLICATION ");
        System.out.println("\t\t\t============================");
        System.out.print("\n\t\t Enter the first number = ");
        a=in.nextFloat();
        System.out.print("\n\t\t Enter the second number = ");
        b=in.nextFloat();
        System.out.print("\n\t\t multiplication of two numbers : "+ m.mul(a,b));

        System.out.println("\n\n\t\t\t\t DIVISION ");
        System.out.println("\t\t\t============================");
        System.out.print("\n\t\t Enter the first number = ");
        a=in.nextFloat();
        System.out.print("\n\t\t Enter the second number = ");
        b=in.nextFloat();
        System.out.print("\n\t\t division of two numbers : "+ o.div(a,b));
    }
}