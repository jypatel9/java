import java.util.Scanner;

public class digitwords {
    
    public static void main(String args[])
    {
        int num,rem,rev=0,temp;
        Scanner sc=new Scanner(System.in);

        num=sc.nextInt();
        temp=num;

        while(temp>0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }

        while(rev>0)
        {
            rem=rev%10;
            switch(rem)
            {
                case 1:
                {
                    System.out.println("One");
                    break;
                }
                case 2:
                {
                    System.out.println("two");
                    break;
                }
                case 3:
                {
                    System.out.println("Three");
                    break;
                }
                case 4:
                {
                    System.out.println("Four");
                    break;
                }
                case 5:
                {
                    System.out.println("Five");
                    break;
                }
                case 6:
                {
                    System.out.println("Six");
                    break;
                }
                case 7:
                {
                    System.out.println("Seven");
                    break;
                }
                case 8:
                {
                    System.out.println("Eight");
                    break;
                }
                case 9:
                {
                    System.out.println("Nine");
                    break;
                }
                case 0:
                {
                    System.out.println("Zero");
                    break;
                }
            }
        rev=rev/10;            
        }
    }
}
