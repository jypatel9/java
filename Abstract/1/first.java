abstract class Super
{
    public Super()
    {
        System.out.println("This is Super Constructor.");
    }
    public void method1()
    {
        System.out.println("This is method1.");
    }
    abstract public void method2();//abstract method is undefined method.
}
class sub extends Super
{
    public sub()
    {
        System.out.println("Constructor of sub class.");
    }
    public void method2()
    {
        System.out.println("Method 2.");
    }
}
public class first {
    public static void main(String args[])
    {
        sub s=new sub();
        s.method2();
        s.method1();
    }
}
