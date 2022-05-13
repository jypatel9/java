public class elipse {
    
    static void show(String... s)
    {
        int num=1;
        for(String p:s)
        {
            System.out.println(num+" => "+p);
            num++;
        }
    }

    public static void main(String args[])
    {
        show("jay","abc","def");
    }

}
