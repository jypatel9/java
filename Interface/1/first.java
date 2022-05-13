interface test
{
    void waytest1();
    void waytest2();
}
class Super implements test
{
    public void waytest1()
    {
        System.out.println("Way of test 1.");
    }
    public void waytest2()
    {
        System.out.println("Way of test 2.");
    }
}

public class first {
    public static void main(String args[])
    {
        Super s=new Super();
        s.waytest1();
        s.waytest2();
    }   
}
