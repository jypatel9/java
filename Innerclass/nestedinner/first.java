class outer
{
    public int x=10;
    class inner
    {
        public int y=5;
        public void display()
        {
            System.out.println("Value x : "+x);
            System.out.println("Value y : "+y);
        }
    }
    public void data()
    {
        inner i=new inner();
        System.out.println("Inner class value : "+i.y);
        i.display();
    }
}
public class first {
    public static void main(String args[])
    {
        outer o=new outer();
        o.data();
    }
}
