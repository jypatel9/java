import java.util.Scanner;

public class area {
    
    static double area(double length,double bredth)
    {
        return length*bredth;
    }

    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double length,bredth,radius,area;
        System.out.print("plese enter Length :- ");
        length=sc.nextDouble();
        System.out.print("please enter bredth :- ");
        bredth=sc.nextDouble();
        System.out.print("please enter radius :- ");
        radius=sc.nextDouble();

        area=area(length,bredth);
        System.out.println("Area of rectangle :- "+area);

        area=area(radius);
        System.out.println("Area of Circle is :- "+area);
    }

}
