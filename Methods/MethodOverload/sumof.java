public class sumof {

    static int sum(int ...a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        return sum;
    }

    public static void main(String args[])
    {
        System.out.println("Sum of Series of element is "+sum(10,20,30,40,50));
    }

}
