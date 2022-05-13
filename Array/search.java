import java.util.Scanner;

public class search {
    
    public static void main(String args[])
    {
        int a[]=new int[10];
        int key;

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter Num"+i+" => ");
            a[i]=sc.nextInt();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("You Have Entered :- ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("Please Enter the Searching Value :- ");
        key=sc.nextInt();

        for(int i=0;i<a.length;i++)
        {
            if(key==a[i])
            {
                System.out.println("Find The Value Index of :- "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found..");
    }

}
