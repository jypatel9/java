import java.util.Scanner;

public class factorial {
    
    public static void main(String args[])
    {
        int num,fact=1;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter number of find factorial :- ");
        num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }

        System.out.println("Factorial is :- "+fact);
    }

}
