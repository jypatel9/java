import java.util.Scanner;

public class armstrong {
    
    public static void main(String args[])
    {
        int num,rem,temp,arm=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter find number armstrong or not . :- ");
        num=sc.nextInt();

        temp=num;

        while(temp>0)
        {
            rem=temp%10;
            arm=arm+(rem*rem*rem);
            temp=temp/10;
        }

        if(num==arm)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is Not Armstrong");
        }
    }
}
