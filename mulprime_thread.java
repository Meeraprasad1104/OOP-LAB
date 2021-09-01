import java.util.*;
class thread1 extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++){
            System.out.println(" 5 * " + i + " = " + (5*i));
            //try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

class thread2 extends Thread{
    public void run()
    {
        int i,j,n,count=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the limit = ");
        n=sc.nextInt();
        System.out.println("prime numbers are = ");
        for(i=1;i<=n;i++)
        {
            count = 0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && i!=1)
            System.out.println(i + " ");
            //try {Thread.sleep(250);} catch(Exception e){}
        }
    }
}

public class mulprime_thread
{
    public static void main(String arg[])
    {
        
        thread1 t1 =new thread1();
        t1.start();

        
        thread2 t2 =new thread2();
        t2.start();
    }
}