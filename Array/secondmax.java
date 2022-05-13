import java.util.Scanner;

public class secondmax {
    
    public static void main(String args[])
    {
        int a[]=new int[8];
        int max,secondmax;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter Num"+i+" => ");
            a[i]=sc.nextInt();
        }

        max=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(max<=a[i])
            {
                max=a[i];
            }
        }
        secondmax=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(secondmax<=a[i])
            {
                if(!(a[i]==max))
                {
                    secondmax=a[i];
                }
            }
        }
        System.out.println("Second Maximum Number is :- "+secondmax);

    }

}
// //different method is 
// int max1,max2;
// max1=max2=a[0];
// for(int i=0;i<a.length;i++)
// {
//     if(a[i]>max1)
//     {
//         max2=max1;
//         max1=a[i];
//     }
//     else if(a[i]>max2)
//     {
//         max2=a[i];
//     }
// }