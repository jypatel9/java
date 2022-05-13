class Super
{
    void display()
    {
        System.out.println("Hello.");
    }
}
class sub extends Super
{
    void display()
    {
        System.out.println("Hello world.");
    }
}

public class first {
    
    public static void main(String args[])
    {
        Super sup=new Super();
        sup.display();

        sub s=new sub();
        s.display();
    }

}
