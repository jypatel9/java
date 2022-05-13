import java.util.Scanner;

public class prac {
    
    static int maximum(int x,int y)
    {
        System.out.println(x);
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }

    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num1 :- ");
        a=sc.nextInt();
        System.out.print("Enter Num2 :- ");
        b=sc.nextInt();
        c=maximum(a,b);
        System.out.println("Maximum Value is :- "+c);
        
    }

}
