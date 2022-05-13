import java.util.*;

class quadrtic
{
    public static void main(String args[])
    {
        int a,b,c;
        double r1,r2;
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter a :- ");
        a=sc.nextInt();
        System.out.println("please enter b :- ");
        b=sc.nextInt();
        System.out.println("please enter c :- ");
        c=sc.nextInt();

        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        
        System.out.println("root are "+r1+"  "+r2);
    }
}