class cpu
{
 int price;
 cpu(int p)
 {
     price=p;
     System.out.println("\n"+"price = "+price);

 }
    class  processor
    {
        int cores;
        String manufacture;
        processor(int c, String m)
        {
            cores=c;
            manufacture=m;
        }
        void display()
        {
        System.out.println("\n"+"cores = "+cores+"\t"+"manufacture = "+manufacture);
        
        }
    }
    static class ram
    {
        int memory;
        String manufacture;
        ram(int y,String m)
        {
            memory=y;
            manufacture=m;
        }
        void display1()
        {
        System.out.println("\n"+"memory = "+memory+"\t"+"manufacture = "+manufacture);
        }
    }
    public static void main(String arg[])
    {
    cpu c1=new cpu(10000);
    cpu.processor p1=c1.new processor(4,"intel");
    p1.display();
    cpu.ram r1=new cpu.ram(16,"intel");
    r1.display1();
    }
}