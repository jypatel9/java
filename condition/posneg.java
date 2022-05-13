import java.util.Scanner;

class posneg
{
    public static void main(String args[])
    {
        int num=5;
        Scanner sc=new Scanner(System.in);

        // System.out.print("enter num :- ");
        // num=sc.nextInt();

        if(num>=0)
        {
            System.out.println("number is positive.");
        }
        else
        {
            System.out.println("number is negative.");
        }
    }
}