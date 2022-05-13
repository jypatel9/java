import java.lang.*;
import java.util.*;

class areaoftri2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,s;
        double area;    
        System.out.println("please enter a :- ");
        a=sc.nextFloat();
        System.out.println("please enter b :- ");
        b=sc.nextFloat();
        System.out.println("plese enter c :- ");
        c=sc.nextFloat();
        s=(a*b*c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("area of traingle is :- "+area);
    }
}