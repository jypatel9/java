class customer
{
    private String customerID;
    private String customerName;
    private String customerAddress;
    private String customerMobile;

    public customer(String customerid,String customername)
    {
        customerID=customerid;
        customerName=customername;
    }
    public String getcustomerID()
    {
        return customerID;
    }
    public String getcustomerName()
    {
        return customerName;
    }
    public String getcustomerAddress()
    {
        return customerAddress;
    }
    public String getcustomerMobile()
    {
        return customerMobile;
    }
    public void setcustomerAddress(String add)
    {
        customerAddress=add;
    }
    public void setcustomerMobile(String mob)
    {
        customerMobile=mob;
    }
}

public class fivethree {
    
    public static void main(String args[])
    {
        customer c=new customer("D402", "Jay Desai");
        c.setcustomerAddress("Tri soc.,ahmedabad");
        c.setcustomerMobile("+91 9871234569");
        System.out.println("Customer Id     "+c.getcustomerID());
        System.out.println("Customer Name   "+c.getcustomerName());
        System.out.println("Customer Address"+c.getcustomerAddress());
        System.out.println("Customer Mobile "+c.getcustomerMobile());
    }

}
