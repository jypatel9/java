import java.util.Scanner;

public class multiply {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mat1[][]=new int[3][3];
        int mat2[][]=new int[3][3];
        int mul[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter "+"["+i+"]"+"["+j+"]"+" => ");
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter "+"["+i+"]"+"["+j+"]"+" => ");
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Matrix 1: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Matrix 2: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mul[i][j]=mat1[i][j]*mat2[i][j];
            }
        }
        System.out.println("");
        System.out.println("Multiplication of matrix : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
