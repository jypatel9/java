abstract class my
{
    abstract void display();
}
class outer
{
    public void meth()
    {
        my m=new my(){
            void display()
            {
                System.out.println("Display.");
            }
        };
        m.display();
    }
}
public class three {
    public static void main(String args[])
    {
        outer o=new outer();
        
    }
}
