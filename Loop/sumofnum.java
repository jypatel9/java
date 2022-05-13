import java.util.Scanner;

public class sumofnum {
    
    public static void main(String args[])
    {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number :- ");
        num=sc.nextInt();

        for(int i=0;i<=num;i++)
        {
            sum+=i;
        }

        System.out.println("Sum of Numbers :- "+sum);

    }

}
