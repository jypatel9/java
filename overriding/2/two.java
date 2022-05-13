class tv
{
    public void switchon()
    {
        System.out.println("TV is switch on.");
    }
    public void changechannel()
    {
        System.out.println("TV Channel is Change.");
    }
}
class smarttv extends tv
{
    @Override
    public void switchon()
    {
        System.out.println("smarttv is switch on.");
    }
    
    @Override
    public void changechannel()
    {
        System.out.println("smarttv channel is change. ");
    }

    public void browse()
    {
        System.out.println("smarttv browse on.");
    }
}
public class two {
    public static void main(String args[])
    {
        smarttv st=new smarttv();
        st.switchon();
        st.changechannel();
        st.browse();
    }
}
