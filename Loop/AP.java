import java.util.Scanner;

public class AP {
    
    public static void main(String args[])
    {
        int start_term,commen_diff,n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Please describe starting term of searies. :- ");
        start_term=sc.nextInt();
        System.out.print("please describe Commen difference of searies :- ");
        commen_diff=sc.nextInt();
        System.out.print("enter length of series :- ");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(start_term);
            start_term=start_term+commen_diff;
        }
    }

}
