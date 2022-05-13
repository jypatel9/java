import java.util.Scanner;

class ifelse
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("please enter a :- ");
        a=sc.nextInt();

        System.out.print("please enter b :- ");
        b=sc.nextInt();

        System.out.print("please enter c :- ");
        c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greater than all. "+a);
            }
            else
            {
                System.out.println("c is greater than all. "+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is greater than all. "+b);
            }
            else
            {
                System.out.println("c is greater than all. "+c);
            }
        }
    }
}