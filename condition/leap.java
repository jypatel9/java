import java.util.Scanner;

public class leap {
    
    public static void main(String args[])
    {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter year :- ");
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Year is Leap Year");
                }
                else
                {
                    System.out.println("Year is not Leap Year");
                }
            }
            else
            {
                System.out.println("year is leap year.");
            }
        }
        else{
            System.out.println("Year is not Leap Year");
        }
    }

}
