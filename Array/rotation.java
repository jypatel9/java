import java.util.Scanner;

public class rotation {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        int temp=0;

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter num"+i+" => ");
            a[i]=sc.nextInt();
        }
        System.out.print("");
        System.out.println("You Have Entered ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        temp=a[0];
        int j=1;
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[j];
            ++j;
        }
        a[a.length-1]=temp;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }

}
