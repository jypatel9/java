class outer
{
    public void display()
    {
        class local
        {
            public void display1()
            {
                System.out.println("Output display.");
            }
        }
        local l=new local();
        l.display1();
    }
}
public class local {
    public static void main(String args[])
    {
        outer o=new outer();
        o.display();
    }
}
