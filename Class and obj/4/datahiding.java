class rectangle {
    private int length;
    private int bredth;

    public int getlength() {
        return length;
    }

    public int getbredth() {
        return bredth;
    }

    public void setlength(int l)
    {
        if(l>0)
        {
            length=l;
        }
        else
        {
            length=0;
        }
    }
    public void setbredth(int b)
    {
        if(b>0)
        {
            bredth=b;
        }
        else
        {
            bredth=0;
        }
    }

    public int areaofrect() {
        return length * bredth;
    }

    public int areaofperimeter() {
        return 2 * (length + bredth);
    }
}

public class datahiding {

    public static void main(String args[]) {

        rectangle r=new rectangle();
        r.setlength(20);
        r.setbredth(-10);
        System.out.println("Area of ractangle : "+r.areaofrect());
        System.out.println("Area of Perimeter : "+r.areaofperimeter());

        System.out.println("Length is : "+r.getlength());
        System.out.println("Bredth is : "+r.getbredth());
    }

}
