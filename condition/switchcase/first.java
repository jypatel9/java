import java.util.Scanner;

public class first {
    
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter number of day :- ");
        num=sc.nextInt();

        switch(num)
        {
            case 1:
            {
                System.out.println("today is monday.");
                break;
            }
            case 2:
            {
                System.out.println("today is tuesday.");
                break;
            }
            case 3:
            {
                System.out.println("today is wednesday.");
                break;
            }
            case 4:
            {
                System.out.println("today is thursday.");
                break;
            }
            case 5:
            {
                System.out.println("today is friday.");
                break;
            }
            case 6:
            {
                System.out.println("today is saturday.");
                break;
            }
            case 7:
            {
                System.out.println("today is sunday.");
                break;
            }
            default:
            {
                System.out.println("please enter valid number.");
                break;
            }
        }
    }

}
