import java.util.*;
class main
{
    void add()
    {
        Stack<Integer> s = new Stack<Integer>();
        s.add(100);
        s.add(200);
        s.add(300);
        System.out.println("\n\tnew stack = " +s);
    }
    void size()
    {
        Stack<Integer> s = new Stack<Integer>();
        s.add(100);
        s.add(200);
        s.add(300);
        System.out.println("\n\t the size of the stack = "+s.size());

    }
    void peek()
    {
        Stack<Integer> s = new Stack<Integer>();
        s.add(100);
        s.add(200);
        s.add(300);
        System.out.println("\n\t peek of the stack = "+s.peek());

    }
    void pop()
    {
        Stack<Integer> s = new Stack<Integer>();
        s.add(100);
        s.add(200);
        s.add(300);
        System.out.println("\n\t pop of the stack = "+s.pop());
        System.out.println("\n\t new array = "+ s);

    }
    void search()
    {
        Stack<Integer> s = new Stack<Integer>();
        s.add(1000);
        s.add(900);
        s.add(700);
        System.out.println("\n\t searching element of the stack = "+s.search(400));
    }
    void traverse()
    {
        Stack<Integer> s = new Stack<Integer>();
        s.add(1000);
        s.add(900);
        s.add(700);
        for(Integer i:s)
            System.out.println("\n\ttraversing each element in the stack = "+ i + " ");
    }
    void remove()
    {
        Stack<Integer> s = new Stack<Integer>();
        s.add(1000);
        s.add(900);
        s.add(700);
        System.out.println("\n\t removing ana element in the stack = " +s.remove(0));
        System.out.println("\n\t new stack = " +s);
    }
}
class stack_list
{
    public static void main (String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        main m =new main();
        //Stack<integer> s = new Stack<integer>();
        do{
            System.out.println("\n\t\t\tSTACK LIST");
            System.out.println("\n\t\t==========================");
            System.out.println("\n\t 1.ADD");
            System.out.println("\n\t 2.SIZE");
            System.out.println("\n\t 3.PEEK");
            System.out.println("\n\t 4.POP");
            System.out.println("\n\t 5.SEARCH");
            System.out.println("\n\t 6.TRAVERSAL");
            System.out.println("\n\t 7.REMOVE");
            System.out.println("\n\t 8.EXIT");
            System.out.print("\n\t\t enter your choice = ");
            n  =  sc.nextInt();
            switch(n)
            {
                case 1: m.add();
                        break;
                case 2: m.size();
                        break;
                case 3: m.peek();
                        break;
                case 4: m.pop();
                        break;
                case 5: m.search();
                        break;
                case 6: m.traverse();
                        break;
                case 7: m.remove();
                        break;
                case 8: System.out.println("\n\t program exiting...!!!!!");
                        break;
                default:System.out.println("\n\t try another menu.....");
            }

        }
        while(n!=8);
    }
}