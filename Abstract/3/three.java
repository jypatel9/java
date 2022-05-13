abstract class shape
{
    abstract void peremter();
    abstract void area();
}
class circle extends shape
{
    public double radius;
    public circle(double r)
    {
        System.out.println("Circle : ");
        this.radius=r;
    }
    public void peremter()
    {
        double p=2*Math.PI*radius;
        System.out.println("Peremeter of circle : "+p);
    }
    public void area()
    {
        double a=Math.PI*radius*radius;
        System.out.println("Area of circle : "+a);
        System.out.println("");
    }
}
class ractangle extends shape
{
    public double length;
    public double bredth;
    public ractangle(double length,double bredth)
    {
        System.out.println("Ractangle : ");
        this.length=length;
        this.bredth=bredth;
    }
    public void peremter()
    {
        double ans=2*(length+bredth);
        System.out.println("Peremeter of ractangle : "+ans);
    }
    public void area()
    {
        double ans=length*bredth;
        System.out.println("Area of ractangle : "+ans);
    }
}
public class three {
    public static void main(String args[])
    {
        shape s1=new circle(50);
        s1.peremter();
        s1.area();
        shape s2=new ractangle(25.6, 30);
        s2.peremter();
        s2.area();
    }
}