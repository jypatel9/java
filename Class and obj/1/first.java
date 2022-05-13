class ractangle
{
    public double length;
    public double bredth;

    public double areaofractangle()
    {
        return length*bredth;
    }
    public double areaofperimeter()
    {
        return 2*(length+bredth);
    }
    public boolean islengthbredth()
    {
        if(length==bredth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


public class first {
    
    public static void main(String args[])
    {
        ractangle r1=new ractangle();
        r1.length=18;
        r1.bredth=18;
        System.out.println("Area of ractangle : "+r1.areaofractangle());
        System.out.println("Area of Perimeter : "+r1.areaofperimeter());
        System.out.println("Is Length and bredth same? : "+r1.islengthbredth());
    }

}
