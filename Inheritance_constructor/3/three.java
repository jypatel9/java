class ractangle
{
    private double length;
    private double bredth;

    public ractangle()
    {
        length=bredth=1;
        System.out.println("base class non-param constructor.");
    }   
    public ractangle(Double l,Double b)
    {
        this.length=l;
        this.bredth=b;
    }
    public double getlength()
    {
        return length;
    }
    public double getbredth()
    {
        return bredth;
    }
}
class cuboid extends ractangle
{
    private double height;
    public cuboid()
    {
        height=1;
    }
    public cuboid(double h)
    {
        this.height=h;
    }
    public cuboid(double l,double b,double h)
    {
        super(l,b);
        this.height=h;
    }
    public double volume()
    {
        return getlength()*getbredth()*height;
    }
}

public class three {
    public static void main(String args[])
    {
        cuboid c=new cuboid(10,12,8.5);
        System.out.println("Volume of cuboid : "+c.volume());
    }
}
