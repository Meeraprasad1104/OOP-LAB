import java.util.*;
public class Employee
{
    int  eNo;
    String eName;
    int eSalary;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        System.out.print("\n"+"ENTER EMPLOYEE Number="+"\t");
        eNo=sc.nextInt();
      
        System.out.print("ENTER EMPLOYEE name="+"\t");
        eName =sc.next();
   
        System.out.print("ENTER EMPLOYEE salary="+"\t");
        eSalary=sc.nextInt();
    }
    void disp()
    {
        System.out.println("\n"+eNo+"\t"+eName+"\t"+eSalary);
    }
    void disp1()
    {
        
        System.out.println("\n"+eNo+"\t"+eName+"\t"+eSalary);
        
    }
    
    public static void main(String arg[])
    {
        int n=2,no;
        Employee emp[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            emp[i]=new Employee();
            emp[i].read();
            
        }
        for(Employee i:emp)
        {
            i.disp();
        }
        Scanner sc=new Scanner(System.in);
         System.out.println("\n"+"\t"+"Searching");
        System.out.print("\n"+"Enter a searching Number=");
        no =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(emp[i].eNo == no)
            {
                emp[i].disp1();
            }
            break;
        }
    }
}
    