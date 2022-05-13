import java.util.Scanner;

public class dispdigit {
    
    public static void main(String args[])
    {
        int num,rem;
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter number :- ");
        num=sc.nextInt();

        while(num>0)
        {
            rem=num%10;
            num=num/10;
            System.out.println(rem);
        }
    }

}
