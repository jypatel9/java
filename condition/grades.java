import java.util.Scanner;

public class grades {
    
    public static void main(String args[])
    {
        float sub1,sub2,sub3;
        double sum,per;

        Scanner sc=new Scanner(System.in);

        System.out.print("please enter marks of sub1 :- ");
        sub1=sc.nextFloat();
        System.out.print("please enter marks of sub2 :- ");
        sub2=sc.nextFloat();
        System.out.print("please enter marks of sub3 :- ");
        sub3=sc.nextFloat();

        sum=sub1+sub2+sub3;
        per=sum/3;

        System.out.println("Sum is . :- "+sum);
        System.out.println("Percentage is. :- "+per);

        if(per>=80)
        {
            System.out.println("Congratulation you achieved distriction.");
        }
        else if(per<80 && per>=60)
        {
            System.out.println("you achieved GRADE : A");
        }
        else if(per<60 && per>=35)
        {
            System.out.println("you achieved GRADE : B");
        }
        else
        {
            System.out.println("unfortunatily you are failed.");
        }
    }

}
