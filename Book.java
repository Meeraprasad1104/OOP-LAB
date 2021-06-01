import java.util.*;
class Book
{
    int ISBN;
    String title,author;
    int price;
    String publisher;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        System.out.print("\n"+"enter ISBN="+"\t");
        ISBN=sc.nextInt();

        System.out.print("enter title="+"\t");
        title=sc.next();

        System.out.print("enter author="+"\t");
        author=sc.next();

        System.out.print("enter price="+"\t");
        price=sc.nextInt();

        System.out.print("enter publisher=");
        publisher=sc.next();
       
    }
    void disp()
    {
        System.out.println("\n"+ISBN +"\t"+ title +"\t"+ author +"\t"+ price +"\t"+ publisher);
    }
    public static void main(String arg[])
    {
        Book temp=new Book();
        Book b[]=new Book[5];
        for(int i=0;i<5;i++)
        {
            b[i]=new Book();
            b[i].read();
        }
        for(int i=0; i<5; i++)
        {
            for(int j=i+1; j<5; j++)
                if(b[i].title.compareTo(b[j].title)>0)
                {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
        }
        
        for(Book i:b)
        {
           i.disp();
        }

    }
}