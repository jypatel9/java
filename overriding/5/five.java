class Super
{
    public void method1()
    {
        System.out.println("Super Method 1.");
    }
    public void method2()
    {
        System.out.println("Super Method 2.");
    }
}
class sub extends Super
{
    public void method2()
    {
        System.out.println("Sub Method 2.");
    }
    public void method3()
    {
        System.out.println("Sub Method 3.");
    }
}
//dynamic method dispatch
public class five {
    public static void main(String args[])
    {
        sub s=new sub();
        s.method2();
        s.method3();
    }
}
