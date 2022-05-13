import java.util.Scanner;

public class table {
    
    public static void main(String args[])
    {
        int table;
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter do you want table number :- ");
        table=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(table + " * " + i + " = "+(table*i));
        }
    }

}
