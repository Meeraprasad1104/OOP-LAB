import java.util.*;
class matrix
{
    public static void main(String arg[])
    {
    int a[][],b[][],c[][],i,j;
    a=new int[2][2];
    b=new int[2][2];
    c=new int[2][2];
    Scanner obj=new Scanner(System.in);
    System.out.println("\n"+"first matrix");
    
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            a[i][j]=obj.nextInt();
        }
    }
    System.out.println("second matrix");
        
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            b[i][j]=obj.nextInt();
            
        }
    }
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            
        }
    }
    System.out.println("sum of two matrix");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            System.out.print(c[i][j]+"\t");
        }
        System.out.print("\n");
    }
    }
}