class cyclinder
{
    public double radius,height;
    public double lidarea()
    {
        return Math.PI*radius*radius;
    }
    public double totalsurfacearea()
    {
        return 2*lidarea()+circumference()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius; 
    }
    public double volume()
    {
        return lidarea()*height;
    }

}

public class second {
    
    public static void main(String args[])
    {
        cyclinder c1=new cyclinder();
        c1.radius=5.6;
        c1.height=15;
        System.out.println("Lid Area : "+c1.lidarea());
        System.out.println("Total Surface Area : "+c1.totalsurfacearea());
        System.out.println("Circumference : "+c1.circumference());
        System.out.println("Volume : "+c1.volume());
    }

}
