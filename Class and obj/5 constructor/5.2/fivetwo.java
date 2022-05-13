class product
{
    private String itemNum;
    private String itemName;
    private double price;
    private int qty;

    public product(String itemno,String itemname)
    {
        itemNum=itemno;
        itemName=itemname;
    }
    public String getitemNum()
    {
        return itemNum;
    }
    public String getitemName()
    {
        return itemName;
    }
    public void setprice(double p)
    {
        if(p>0)
        {
            price=p;
        }
        else
        {
            price=0;
        }
    }
    public void setqty(int qut)
    {
        if(qut>0)
        {
            qty=qut;
        }
        else
        {
            qty=0;
        }
    }
    public double getitemprice()
    {
        return price;
    }
    public int getitemqty()
    {
        return qty;
    }
}

public class fivetwo {

    public static void main(String args[])
    {
        product p=new product("a24-6", "grocerry1");
        p.setprice(299.75);
        p.setqty(4);
        System.out.println("Product Number : "+p.getitemNum());
        System.out.println("Product Name   : "+p.getitemName());
        System.out.println("Product Price  : "+p.getitemprice());
        System.out.println("Product Qty    : "+p.getitemqty());
    }

}
