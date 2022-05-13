import java.util.Scanner;

public class sum {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter Number "+i+" => ");    
            a[i]=sc.nextInt();
        }

        System.out.println("You Have Entered : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum of All elements is :- "+sum);
        
    }

}
