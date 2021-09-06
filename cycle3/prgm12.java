import java.util.*;
interface shape
{
void area();
void peremeter();
double pi=3.14;
}
    class circle implements shape
    {
        int r;
        Scanner sc=new Scanner(System.in);
        circle()
        {
            System.out.print("\n\t radius of a circle = ");
            r=sc.nextInt();
        }
        public void area()
        {
            System.out.println ("\n\t area of a circle = "+ (pi * r *r));
        }

        public void peremeter()
        {
            System.out.println ("\n\t area of a rectangle = " +(2 * pi * r));
        }
    }

    class rectangle implements shape
    {
        int l,b;
        Scanner sc=new Scanner(System.in);
        rectangle()
        {
            System.out.print("\n\t length of a rectangle = ");
            l=sc.nextInt();
            System.out.print("\n\t bredth of a rectangle = ");
            b=sc.nextInt();
        }
        public void area()
        {
            System.out.println ("\n\t area of a rectagle = " +(l * b));
        }
        public void peremeter()
        {
            System.out.println("\n\t area of a peremeter = " +(2 * (l + b)));
        }
    }
class prgm12
{
    public static void main(String arg[])
    {
        int ch ;
        Scanner sc=new Scanner(System.in);
        circle s1 = new circle();
        rectangle s2= new rectangle();
        do
        {
            System.out.println("\n");
            System.out.println("\n\t\t MENU");
            System.out.println("\t"+"=====================");
            System.out.println("\n\t" + "1. AREA OF A CIRCLE");
            System.out.println("\n\t" + "2. PEREMETER OF A CIRCLE");
            System.out.println("\n\t" + "3. AREA OF A RECTANGLE");
            System.out.println("\n\t" + "4. PEREMETER OF A RECTANGLE");
            System.out.println("\n\t" + "5. EXIT ");

            System.out.print("\n\t" + " ENTER your choice = ");
            ch=sc.nextInt();
    
            switch(ch)
            {
                case 1: s1.area();
                        break;
                
                case 2: s1.peremeter();
                        break;

                case 3: s2.area();
                        break;

                case 4: s2.peremeter();
                        break;

                case 5: System.out.println("\n\t Program is exiting ....");
					    break;

                default: System.out.println("\n try another menu....");
                         
            }
        }
        while( ch != 5);
    }
}