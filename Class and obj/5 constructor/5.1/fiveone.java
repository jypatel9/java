class cyclinder
{
    private double radius;
    private double height;

    public cyclinder()
    {
        radius=0;
        height=0;
    }
    public cyclinder(double r,double h)
    {
        setdata(r, h);
    }
    public void setdata(double r,double h)
    {
        if(r>0 && h>0)
        {
            radius=r;
            height=h;
        }

        if(r<0)
        {
            radius=0;
        }
        if(h<0)
        {
            height=0;
        }
    }
    public double getradius()
    {
        return radius;
    }
    public double getheight()
    {
        return height;
    }

    public double lidarea()
    {
        return Math.PI*radius*radius;
    }
    public double totalsurface()
    {
        return 2*lidarea()+circumference()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}

public class fiveone {
    
    public static void main(String args[])
    {
        cyclinder c=new cyclinder(8,15);
        System.out.println("Total Lid Area : "+c.lidarea());
        System.out.println("Total surface area : "+c.totalsurface());
        System.out.println("Circumference : "+c.circumference());
    }

}
