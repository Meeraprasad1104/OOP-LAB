import java.util.*;
interface student
{
    int rollno = 3;
    String name = "meera";
    String dept = "cs";
    void show1();
}

interface sports
{
    String item="cricket";
    int rank=2;
    void show2();
    
}

class result implements student,sports
{
    public void show1()
    {
        System.out.println("\n\t" + "rollno = " + rollno + "\n\t" + "name = " +name + "\n\t" + "department = " + dept );
    }
    public void show2()
    {
        System.out.println("\n\t" + "item = " + item + "\n\t" + "rank = " + rank);
    }
    
}
class prgm_16
{
    public static void main(String arg[])
    {
        
        Scanner sc=new Scanner(System.in);
        result r1=new result();
        r1.show1();
        result r2=new result();
        r2.show2();
    }
}