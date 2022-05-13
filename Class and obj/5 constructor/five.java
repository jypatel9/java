class ractangle
{
    private int length;
    private int bredth;

    public ractangle()
    {
        length=0;
        bredth=0;
    }
    public ractangle(int l,int b)
    {
        length=l;
        bredth=b;
    }
    public int areaofract()
    {
        return length*bredth;
    }
}

public class five {
    
    public static void main(String args[])
    {
        ractangle r=new ractangle(15,6);
        System.out.println("Area of ractangle : "+r.areaofract());
    }

}
