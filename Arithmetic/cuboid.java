import java.util.*;
class cuboid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float length,bredth,height;
        double volume,totalarea;
        System.out.println("Please enter length :- ");
        length=sc.nextFloat();
        System.out.println("please enter bredth :- ");
        bredth=sc.nextFloat();
        System.out.println("please enter height :- ");
        height=sc.nextFloat();

        totalarea=2*(length*bredth+length*height+bredth*height);
        volume=length*bredth*height;

        System.out.println("area of cuboid is  :-  "+totalarea);
        System.out.println("volume of cuboid is :- "+ volume);
    }
}