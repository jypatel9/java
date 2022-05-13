class ractangle
{
    public double length;
    public double bredth;
    public int x=10;

    public ractangle(Double length,Double bredth)
    {
        this.length=length;
        this.bredth=bredth;
    }
}
class cuboid extends ractangle
{
    public double height;
    public int x=15;

    public cuboid(double l,double b,double h)
    {
        super(l, b);
        this.height=h;
    }
    void display()
    {
        System.out.println("X : super class : "+super.x);
        System.out.println("X : current class : "+x);
    }
}
public class four {
    
    public static void main(String args[])
    {
        cuboid c=new cuboid(10, 20, 30);
        c.display();
    }

}
