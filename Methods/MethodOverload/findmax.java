public class findmax {
    
    static int max(int... a)
    {
        int m=a[0];
        if(a.length==0)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            for(int i=1;i<a.length;i++)
            {
                if(a[i]>m)
                {
                    m=a[i];
                }
            }
        }
        return m;
    }

    public static void main(String args[])
    {
        int x=max(1,2,3,4,5,6,7,8,9);
        System.out.println("Maximum Value is :- "+x);
    }

}
