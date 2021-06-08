import java.util.*;
class person
{
    Scanner sc= new Scanner(System.in);
    String Name;
    String Gender;
    String Address;
    int Age;
    person() 
    {
        System.out.print("\n"+"enter  your name = "  );
        Name=sc.next();

        System.out.print("\n"+"enter   gender = " );
        Gender=sc.next();

        System.out.print("\n"+"enter   address = " );
        Address=sc.next();

        System.out.print("\n"+"enter  your age = ");
        Age=sc.nextInt();

    }
    void disp()
    {
        System.out.println("\n"+"Name  = "+Name);

        System.out.println("\n"+"Gender  = "+Gender);

        System.out.println("\n"+"Address= "+Address);

        System.out.println("\n"+"Age  = "+Age);
        
    }
}


class Employee extends person
{
    Scanner sc= new Scanner(System.in);
    int empid;
    String company_name;
    String Qualification;
    int salary;
    Employee()
    {

        System.out.print("\n"+"enter  the employee id = ");
        empid=sc.nextInt();

        System.out.print("\n"+"enter  the company name = ");
        company_name=sc.next();

        System.out.print("\n"+"enter  your Qualification = ");
        Qualification=sc.next();

        System.out.print("\n"+"enter  your salary = ");
        salary=sc.nextInt();
       
    }
    void disp()
    {
        super.disp();

        System.out.println("\n"+"employee id  = "+ empid);

        System.out.println("\n"+"company name  = "+ company_name);

        System.out.println("\n"+"Qualification  = "+ Qualification);

        System.out.println("\n"+"salary  = "+ salary);
        
    }
}



class Teacher extends Employee
{
    Scanner sc= new Scanner(System.in);
    String subject;
    String department;
    int teacherid;
    Teacher()
    {
        System.out.print("\n"+"enter  subject = ");
        subject=sc.next();

        System.out.print("\n"+"enter  the department name = ");
        department=sc.next();

        System.out.print("\n"+"enter  the teacherid = ");
        teacherid=sc.nextInt();
    }
    void disp()
    {
        super.disp();

        System.out.println("\n"+"subject  = "+ subject);

        System.out.println("\n"+"department name  = " + department);

        System.out.println("\n"+"teacherid  = "+ teacherid);

    }
}


class sample
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int n=2;
        Teacher t[]=new Teacher[n];
        for (int i=0; i<n; i++)
        {
            System.out.println("\n\t"+"ENTER DETAILS OF TEACHER "+(i+1));
            t[i]= new Teacher();
        }
        for (Teacher i:t)
        {
            System.out.println("\n\t\t"+ "MEMBER " );
            System.out.println("\n\t=========================");
            i.disp();
            System.out.print( "\n");
        }
    }
}