class hondacity
{
    static long price=10;

    public static double onroadprice(String city)
    {
        switch(city)
        {
            case "ahmedabad":
            {
                return price+price*0.1;
            }
            case "surat":
            {
                return price+price*0.09;
            }
            case "bhavnagar":
            {
                return price+price*0.08;
            }
            default:
            {
                return 0;
            }
        }
    }
}
public class exm {
    public static void main(String args[])
    {
        hondacity h1=new hondacity();
        h1.price=100000;
        System.out.println("Price of "+h1.onroadprice("surat"));              
    }
}
