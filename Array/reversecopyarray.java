import java.util.Scanner;

public class reversecopyarray {
    
    public static void main(String args[])
    {
        int a[]=new int[7];
        int b[]=new int[7];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter Num"+i+" => ");
            a[i]=sc.nextInt();
        }
        System.out.println("");
        System.out.println("You have entered : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        int j=0;
        for(int i=b.length-1;i>=0;i--)
        {
            b[i]=a[j];
            j++;
        }
        System.out.println("A copy in B");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }

    }

}
