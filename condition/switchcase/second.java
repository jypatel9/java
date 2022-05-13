import java.util.Scanner;

public class second {
    
    public static void main(String args[])
    {
        int num1,num2;
        String choice;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter num1 :- ");
        num1=sc.nextInt();

        System.out.print("Enter num2 :- ");
        num2=sc.nextInt();

        System.out.println("Now Choose below choices :- ");
        System.out.println("ADD :- for addition");
        System.out.println("Sub :- for subtraction");
        System.out.println("Mul :- for multiplication");
        System.out.println("Div :- for division");
        
        choice=sc.next();

        switch(choice)
        {
            case "Add":
            {
                System.out.println("Addition is : "+(num1+num2));
                break;
            }
            case "Sub":
            {
                System.out.println("Subtraction is : "+(num1-num2));
                break;
            }
            case "Mul":
            {
                System.out.println("Multiplication is : "+(num1*num2));
                break;
            }
            case "div":
            {
                System.out.println("Division is : "+(num1/num2));
                break;
            }
            default:
            {
                System.out.println("please enter correct choice");
                break;
            }
        }
    }
}
