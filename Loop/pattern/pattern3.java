public class pattern3 {
    
    public static void main(String args[])
    {
        int s=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.format("%02d ",s);
                s++;
            }
            System.out.println("");
        }
    }

}
