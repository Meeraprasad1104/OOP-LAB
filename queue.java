import java.util.*;
class main
{
    void add()
    {
        Queue<Integer> q = new PriorityQueue<Integer>(new Comp());   //Queue<Integer> q = new PriorityQueue<Integer>(); these means  we will add elemnts at the same manner we op it
        q.add(1223);
        q.add(250);
        q.add(2452);
        System.out.println("\n\t new queue after sorting  =  " +q);
    }
    void poll()
    {
        Queue<Integer> q = new PriorityQueue<Integer>(new Comp());
        q.add(1223);
        q.add(250);
        q.add(2452);
        System.out.println("\n\t removing the front element = " +q.poll());
        System.out.println("\n\t new queue after reomval   =  " +q);
        
    }
    void peek()
    {
        Queue<Integer> q = new PriorityQueue<Integer>(new Comp());
        q.add(1223);
        q.add(450);
        q.add(2452);
        System.out.println("\n\t peek value of the queue is = " +q.peek());
        System.out.println("\n\t new queue = "+ q);

    }
    void size()
    {
        Queue<Integer> q = new PriorityQueue<Integer>(new Comp());
        q.add(1223);
        q.add(450);
        q.add(2452);
        q.add(1333);
        System.out.println("\n\t size ofthe queue = " +q.size());

    }

}
class queue
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        main m = new main();
        int n;
        do
        {
            System.out.print("\n\t\t  QUEUE List");
            System.out.println("\n\t     =====================");
            System.out.println("\n\t 1.add");
            System.out.println("\n\t 2.poll");
            System.out.println("\n\t 3.peek");
            System.out.println("\n\t 4.size");
            System.out.println("\n\t 5.exit");
            System.out.print("\n\t\t enter your choice = ");
            n = sc.nextInt();
            switch(n)
            {
                case 1: m.add();
                        break;
                case 2: m.poll();
                        break;
                case 3: m.peek();
                        break;
                case 4: m.size();
                        break;
                case 5: System.out.println("\n\t program exiting..!!!!");
                        break;
                default:System.out.println("\n\t try another menu...!!");

            }

        }
        while(n!=5);
    }
}