import java.util.*;
class main
{
    void add()
    {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("hari");
        ar.add("sabari");
        ar.add(1,"ananthu"); //add firts position in the arraylist
        System.out.println("\n\t\t New array = " + ar);
    }
    void remove()
    {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("hari");
        ar.add("sabari");
        ar.add(1,"ananthu"); 
        ar.remove("ananthu");
        System.out.println( "\n\t\t After removal = "+ ar);

    }
    void replace()
    {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("hari");
        ar.add("sabari");
        ar.set(1,"manu");
        System.out.println("\n\t\t After replacement = " + ar);
    }
    void sort()
    {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("hari");
        ar.add("sabari");
        ar.add(1,"ananthu"); 
        Collections.sort(ar);
        System.out.println("\n\t\t After sorting = "+ ar);

    }
    void size()
    {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("hari");
        ar.add("sabari");
        ar.add(1,"ananthu"); 
        System.out.println("\n\t\t Size of the arraylist = "+ ar.size());
    }
}
class arraylist
{
    public static void main(String arg[])
    {
        //ArrayList<String> ar = new ArrayList<String>();
        int n;
        main m=new main();
        Scanner sc =new Scanner(System.in);
        do
        {
        System.out.println("\n\n\t BUILT IN OPERATION IN ARRAY LIST");
        System.out.println("\n\t==================================");
        System.out.println("\n\t\tCASE 1 : ADD ");
        System.out.println("\n\t\tCASE 2 : REMOVE ");
        System.out.println("\n\t\tCASE 3 : REPALCE ");
        System.out.println("\n\t\tCASE 4 : SORT ");
        System.out.println("\n\t\tCASE 5 : SIZE ");
        System.out.println("\n\t\tCASE 6 : EXIT ");
        System.out.print("\n\t enter your choice = ");
        n=sc.nextInt();
            switch(n)
            {
                case 1: m.add();
                        break;
                case 2: m.remove();
                        break;
                case 3: m.replace();
                        break;
                case 4: m.sort();
                        break;
                case 5: m.size();
                        break;
                case 6: System.out.println("\n\t\t program exiting ....!!!!");
                        break;
                default: System.out.println("\n\t\ttry another menu...!!");
            }
        }
        while(n!=6);
    }
}