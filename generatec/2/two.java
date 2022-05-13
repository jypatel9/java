class customer
{
    private String customerID;
    private static int count=1;

    private String generatecustomerID()
    {
        String cid="Cust-"+count;
        count++;
        return cid;
    }
    customer()
    {
        customerID=generatecustomerID();
    }
    public String getcustomerID()
    {
        return customerID;
    }
}
public class two {

    public static void main(String args[])
    {
        customer c1=new customer();
        System.out.println("Customer id of c1 : "+c1.getcustomerID());
        customer c2=new customer();
        System.out.println("Customer id of c2 : "+c2.getcustomerID());
    }

}
