class rectangle
{
    double lenth,width,area;
    String color;
    rectangle()
    {
        lenth=3;
        width=4;
        color="white";

    }
    rectangle(double l,double w,String c)
    {
        lenth=l;
        width=w;
        area= l * w;
        color=c;

    }
    void disp(double l,double w)
    {
        area=l * w;
        System.out.println("\n\t"+lenth+"\t"+width+"\t"+area+"\t"+color);
    }
    void disp1()
    {
        System.out.println("\n\t"+lenth+"\t"+width+"\t"+area+"\t"+color);
    }
    public static void main(String arg[])
    {
        System.out.println("\n\t"+"lenth"+"\t"+"width"+"\t"+"area"+"\t"+"color");
        rectangle r1=new rectangle();
        r1.disp(3,4);
        rectangle r2=new rectangle(6,3,"rose");
        r2.disp1();
        if((r1.area == r2.area) && (r1.color == r2.color))
        {
            System.out.println("\n\t"+"Match Rectangle");
        }
        else
        {
            System.out.println("\n\t"+"Not Match Rectangle");
        }
    }
}
