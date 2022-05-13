class parent
{
    public parent()
    {
        System.out.println("This is parent class");
    }
}
class child extends parent
{
    public child()
    {
        System.out.println("This is child class");
    }
}
class grandchild extends child
{
    public grandchild()
    {
        System.out.println("This is Grand Child");
    }
}

public class constr {
    
    public static void main(String args[])
    {
        grandchild g=new grandchild();
    }

}
