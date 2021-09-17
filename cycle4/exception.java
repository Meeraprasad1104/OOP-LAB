import java.util.*;
 class MyExc extends Exception
{
    MyExc(String msg)
    {
        super(msg);
    }
}
 class  exception
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,s=0,value;
        System.out.print("\n\tenter the limit = ");
        n=sc.nextInt();
        System.out.println("\n\tenter the "+ n +" numbers  ");
        for(i=1;i<=n;i++)
        {
            System.out.print("\n\t\tenter the "+ i + " number = ");
            try{
                 value =sc.nextInt();
                if(value<0)
                {
                    throw new MyExc("\n\tnegative numbers are not allowed");
                }
            
            }
                catch(Exception e)
                {
                    
                     System.out.println(e.getMessage());
                     continue;
               
                }
                
            s=s+value;
        }
         System.out.println("\n\taverage = "+(s/n));
    }
}