import java.util.*;
class Employee
{
    int Empid;
    String name;
    String Address;
    int salary;

    Employee(int e,String n,String a,int s)
    {
        Empid=e;
        name=n;
        Address=a;
        salary=s;
    }
    void disp()
    {
         System.out.print("\n\n");
        System.out.println("\n\t" + "Employee id  =" +Empid);
        System.out.println("\n\t" + "Employee name =" +name);
        System.out.println("\n\t" + "Employee Address =" +Address);
        System.out.println("\n\t" + "Employee salary ="+salary);
    }
}
class Teacher extends  Employee
{
    String department;
    String subject;
    Teacher(int e,String n,String a,int s,String d,String sub)
    {
        super(e,n,a,s);
        department=d;
        subject=sub;
    }
    void disp()
    {
        super.disp();
        System.out.println("\n\t" + "Teacher department =" + department);
        System.out.println("\n\t" + "Teacher subject =" +subject);
    }
}
class inherit_employee
{
    public static void main(String arg[])
    {
        int n=2;
        Teacher T[] = new Teacher[n];
        T[0] = new Teacher(1,"A","AB",11,"CDE","FF");
        T[0].disp();
        T[1] = new Teacher(2,"G","HI",11,"JKL","MM");
        T[1].disp();
    }
}