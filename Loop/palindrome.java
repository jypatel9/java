import java.util.Scanner;

public class palindrome {
    
    public static void main(String args[])
    {
        int num,rem,rev=0,temp;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number :- ");
        num=sc.nextInt();
        temp=num;

        while(temp>0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }

        if(num==rev)
        {
            System.out.println("Number is Palindrome.");
        }
        else
        {
            System.out.println("Number is not palindrome.");
        }
    }
}
