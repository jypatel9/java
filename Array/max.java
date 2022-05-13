import java.util.Scanner;

public class max {
    
    public static void main(String args[])
    {
        int a[]=new int[10];
        int max=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter Num"+i+" => ");
            a[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
        max=a[0];
        System.out.println("");
        for(int i=0;i<a.length;i++)
        {
            if(max<=a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Maximum Element is :- "+max);
    }

}
