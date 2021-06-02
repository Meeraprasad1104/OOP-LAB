import java.util.*;
class stringmenu
{
    int count=0,flag=-1;
    String sentance;
    String arr_words[],temp[];
    String word,rword;
 
    void read()
    {
        Scanner sc=new Scanner(System.in);
         
        sentance=sc.nextLine();
        arr_words = new String[sentance.length()];
        for (int i=0;i<sentance.length();i++)
        {
			arr_words= sentance.split(" ");
		}
    }
   
    void count()
    {
        temp = new String[arr_words.length];
		for (int i=0; i<arr_words.length; i++)
        {
			for (int j=0; j<arr_words.length; j++)
            {
				if (arr_words[i].equalsIgnoreCase(temp[j]))
                {
					flag = 1;
					break;
				}
				else if (arr_words[i].equalsIgnoreCase(arr_words[j]))
                {
					count++;
				}
			}
			if (flag!=1)
            {
				System.out.println("\n\t" + arr_words[i] + "\t : " + count);
				count=0;
				temp[i]=arr_words[i];
			}
			else
            {
				flag=-1;
			}
        }
     
    }
    void replace()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\t"+"Enter the old word : ");
        String word = sc.nextLine();
        System.out.print("\n\t"+"Enter the replacing word : ");
        String rword = sc.nextLine();
            for(int i=0;i<arr_words.length;i++)
            {
			    if (arr_words[i].equals(word))
                {
				    arr_words[i]=rword;
			    }	
		    }
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<arr_words.length;i++)
        {
			sb.append(arr_words[i]+" ");
		}
	    sentance=sb.toString();
        System.out.print("\n\t A new sentance   =  "+sentance+"\n");
		
	}
    void reverse()
    {
        int temp1;
        System.out.print("\n\t Reverse each word  =  ");
		for (int i=0; i<arr_words.length; i++)
        {
			temp1 = arr_words[i].length();
			for (int j=0; j<temp1; j++)
            {
				System.out.print(arr_words[i].charAt(temp1-(j+1)));
			}
			System.out.print(" ");
		}
    }
    
    public static void main(String arg[])
    {
        int choice;
        stringmenu ch = new stringmenu();
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("\n");
            System.out.println("\n\t\t\t "+"MENU");
            System.out.println("\t"+"---------------------------------------------");
            System.out.println("\n\t\t"+"1) Enter Sentence ");
            System.out.println("\n\t\t"+"2) Count of each word");
            System.out.println("\n\t\t"+"3) Replace word");
            System.out.println("\n\t\t"+"4) Reverse each word ");
            System.out.println("\n\t\t"+"5) Exit the program ");
    
    
            System.out.print("\n\t"+"Enter the option = ");
            choice =sc.nextInt();
            

            switch(choice)
            {
                case 1:
                    System.out.print("\n\t"+"Enter the sentance : ");
                    ch.read();
                    break;
                
                case 2:
                    ch.count();
                    break;
                case 3:
                    ch.replace();
                    break;
                case 4:
                    ch.reverse();
                    break;
                case 5:
                    System.out.println("\n\t Program is exiting ....");
					break;
                default:
                System.out.println("\n\t"+"try another menu!");
            } 
        }
        while(choice!=5);
	}
    
}