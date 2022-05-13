import java.util.Scanner;

class first{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter First Name :- ");
        String firstname=input.nextLine();
        
        System.out.println("Enter Last Name :- ");
        String lastname=input.nextLine();

        System.out.println("First Name :- "+firstname+" & Last Name :- "+lastname);
    }
}