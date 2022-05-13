import java.util.Scanner;

public class radix {
    
    public static void main(String args[])
    {
        String num;
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter num string.");
        num=sc.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("binary radix=2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("octal radix=8");
        }
        else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("hexa radix=16");
        }
        else
        {
            System.out.println("not a number");
        }
    }

}
