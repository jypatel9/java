import java.util.Scanner;

public class insert {
    
    public static void main(String args[])
    {
        int a[]=new int[10];
        int key,value;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter num"+i+" => ");
            a[i]=sc.nextInt();
        }
        System.out.println("");
        System.out.println("You Have Entered :- ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println("");

        System.out.println("Now Please Enter which index do you add item? :- ");
        key=sc.nextInt();

        System.out.println("Please Enter Value also :- ");
        value=sc.nextInt();

        int n=6;
        for(int i=n;i>key;i--)
        {
            a[i]=a[i-1];
        }
        a[key]=value;

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
