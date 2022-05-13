import java.util.Scanner;

public class fibonacci {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to fibonacci series.");
        System.out.print("Enter Number of terms :- ");
        int num=sc.nextInt();

        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);

        for(int i=0;i<num-2;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    
}
