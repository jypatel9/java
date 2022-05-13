import java.util.Scanner;

public class young {
    
    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter your age :- ");
        age=sc.nextInt();

        if(age>=18 && age<=30)
        {
            System.out.println("you are younger.");
        }
        else if(age<18)
        {
            System.out.println("you are child or teenager.");
        }
        else
        {
            System.out.println("you are not younger");
        }
    }

}
