public class pattern4 {
    
    public static void main(String args[])
    {
        int s=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j<=i)
                {
                    System.out.print(s+" ");
                    s++;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
