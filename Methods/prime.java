import java.util.Scanner;

public class prime {
    
    static boolean prime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        if(prime(2))
        {
            System.out.println("Prime Number.");
        }
        else
        {
            System.out.println("Not Prime Number.");
        }
    }
}
