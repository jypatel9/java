import java.util.Scanner;

public class countdigit
{
    
    public static void main(String args[])
    {
        int num,rem,count=0;
        Scanner sc=new Scanner(System.in);

        num=sc.nextInt();

        while(num>0)
        {
            rem=num%10;
            num=num/10;
            count++;
        }

        System.out.println("Count of digit is :- "+count);
    }

}
