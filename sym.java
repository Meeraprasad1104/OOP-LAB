import java.util.*;
class sym
{
    public static void main(String arg[])
    {
        int a[][],b[][],i,j,f=1;
        Scanner obj=new Scanner(System.in);
        a=new int[3][3];
        b=new int[3][3];
        System.out.println("\n"+"first matrix"+"\n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
    
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        System.out.println("\n"+"Transpose matrix"+"\n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                 System.out.print(b[i][j]+"\t");
            }
            System.out.print("\n");
        }

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]!=b[i][j])
                {
                    f=0;
                    break;
                }
            }
        }
        if(f!=0)
        {
             System.out.println("symmetric");
        }
        else
        {
            System.out.println(" not symmetric");
        }
    }
}