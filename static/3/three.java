class test
{
    static
    {
        System.out.println("Static 1.");
    }
    static 
    {
        System.out.println("Static 2.");
    }
}
public class three {
    public static void main(String args[])
    {
        test t=new test();
    }
}
