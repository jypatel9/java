import java.util.Scanner;

class areaoftri
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float base,height,area;
        System.out.println("please enter base of triangle :- ");
        base=sc.nextFloat();
        System.out.println("please enter height of triangle :- ");
        height=sc.nextFloat();
        area=(1*base*height)/2;
        System.out.println("here is the value of area of triangle "+area);
    }
}