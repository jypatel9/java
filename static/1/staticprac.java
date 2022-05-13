class first
{
    static int x=10;
    int y=20;

    public void display()
    {
        System.out.println(x+" "+y);
    }

    public static void display1()
    {
        System.out.println(x);
    }
}

public class staticprac {
    public static void main(String args[])
    {
        first f=new first();
        f.display();
        f.display1();
        f.x=50;
        f.y=60;
        f.display();
        f.display1();
    }
}
