import java.util.Scanner;

class oddeven
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter number :- ");
        num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("number is even.");
        }
        else
        {
            System.out.println("number is odd.");
        }
    }
}