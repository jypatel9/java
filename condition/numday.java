import java.util.Scanner;

public class numday {
    
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter day number between [0-6] :- ");
        num=sc.nextInt();

        if(num>=0 && num<7)
        {
            if(num==0)
            {
                System.out.println("Today is Sunday.");
            }
            else if(num == 1)
            {
                System.out.println("Today is monday.");
            }
            else if(num==2)
            {
                System.out.println("today is tuesday.");
            }
            else if(num==3)
            {
                System.out.println("today is wednesday.");
            }
            else if(num==4)
            {
                System.out.println("today is thursday.");
            }
            else if(num==5)
            {
                System.out.println("today is friday");
            }
            else if(num==6)
            {
                System.out.println("today is saturday");
            }
        }
        else
        {
            System.out.println("please enter valid day number");
        }
    }
}
