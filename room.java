class room
{
    int roomno,roomarea;
    String roomtype;
    room()
    {
        roomno=1;
        roomarea=100;
        roomtype="ac";
    }
    room(int n,int a,String t)
    {
        roomno=n;
        roomarea=a;
        roomtype=t;
    }
    void disp()
    {
        System.out.println("\n\t"+roomno+"\t"+roomarea+"\t\t"+roomtype);
    }
    public static void main(String arg[])
    {
        System.out.println("\n\t"+"roomno"+"\t"+"roomarea"+"\t"+"roomtype");
        room r1=new room();
        r1.disp();
        room r2=new room(2,200,"nonac");
        r2.disp();
    }
}