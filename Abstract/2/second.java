abstract class hospital
{
    abstract public void appointment();
    abstract public void emergency();
    abstract public void admit();
    abstract public void billing();
}
class myhospital extends hospital
{
    public void appointment()
    {
        System.out.println("Appointment.");
    }
    public void emergency()
    {
        System.out.println("Emergency.");
    }
    public void admit()
    {
        System.out.println("Admit patient.");
    }
    public void billing()
    {
        System.out.println("Billing.");
    }
}
public class second {
    public static void main(String args[])
    {
        hospital h=new myhospital();
        h.appointment();
        h.admit();
        h.billing();
    }
}
