import java.util.Scanner;

public class copyarray {
    
    public static void main(String args[])
    {
        int a[]=new int[6];
        int b[]=new int[6];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter num"+i+" => ");
            a[i]=sc.nextInt();
        }
        System.out.println("");
        System.out.println("You Have Entered : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<b.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println("");
        System.out.println("Array of a copy in b : ");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }

    }

}
