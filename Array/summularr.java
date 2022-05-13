import java.util.Scanner;

class summularr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b[][]=new int[3][3];
        int a[][]={{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter Num"+"["+i+"]"+"["+j+"]"+" => ");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Your array is :- ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Please Enter Second Matrix");
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter Num"+"["+i+"]"+"["+j+"]"+" => ");
                c[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Second Matrix Value : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+ " ");
            }
            System.out.println("");
        }

        int sum[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j]=b[i][j]+c[i][j];
            }
        }
        System.out.println("Sum of Matrix is ..");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }
    }
}