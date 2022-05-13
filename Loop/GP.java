import java.util.Scanner;

public class GP {
    
    public static void main(String args[])
    {
        int a,r,n;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" , ");
            a*=r;
        }
    }

}
