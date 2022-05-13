class baseclass
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}
class dereivedclass extends baseclass
{
    public double height;

    public double volume()
    {
        return area()*height;
    }
}

public class prac {
    
    public static void main(String args[])
    {
        dereivedclass d=new dereivedclass();
        d.radius=28.2;
        d.height=14;

        System.out.println("Cylinder Volume : "+d.volume());
    }

}
