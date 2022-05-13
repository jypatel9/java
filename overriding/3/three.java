class computer
{
    public void switchon()
    {
        System.out.println("Turn on the computer.");
    }
    public void OS()
    {
        System.out.println("Computer have windows 7 os.");
    }
    public void ram()
    {
        System.out.println("Computer have 8GB ram.");
    }
}
class laptop extends computer
{
    public void switchon()
    {
        System.out.println("Turn on the laptop.");
    }
    public void OS()
    {
        System.out.println("Laptop have windows 10 os.");
    }
    public void ram()
    {
        System.out.println("Laptop have 12GB ram.");
    }
    public void SSD()
    {
        System.out.println("Laptop have 512GB SSD.");
    }
}
public class three {
    public static void main(String args[])
    {
        laptop l=new laptop();
        l.switchon();
        l.OS();
        l.ram();
        l.SSD();
    }
}
