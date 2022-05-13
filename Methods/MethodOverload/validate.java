import java.util.Scanner;

public class validate {

    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    public static void main(String args[]) {

        String name;
        boolean p;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Name :- ");
        name=sc.nextLine();
        p=validate(name);
        if(p)
        {
            System.out.println("Name is correct");
        }
        else
        {
            System.out.println("Name is not correct");
        }

    }

}
