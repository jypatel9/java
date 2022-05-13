class parent{
    public parent()
    {
        System.out.println("Parent class.");
    }
    public parent(int x)
    {
        System.out.println("parameterized constructor. : "+x);
    }
}
class child extends parent
{
    public child()
    {
        System.out.println("Child class.");
    }
    public child(int y)
    {
        System.out.println("Parameterized constructor.");
    }
    public child(int x,int y)
    {
        super(x);//super class is keyword which use to refere superclass property.
        System.out.println("child param use : "+y);
    }
}

public class two {
    
    public static void main(String args[])
    {
        child c=new child(5,10);
    }

}
