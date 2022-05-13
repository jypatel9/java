import java.util.Scanner;

public class reverse {

    static int reverse(int n) {
        int rem, rev = 0;

        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
    static int[] reverse(int a[])
    {
        int c=0;
        int b[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            b[c]=a[i];
            c++;   
        }
        return b;
    }

    public static void main(String args[]) {
        int num, choice;
        int a[] = new int[6];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Here is choice :- ");
            System.out.println("1. :- reverse the number ");
            System.out.println("2. :- reverse the array ");
            System.out.println("3. :- exit ");
            System.out.print("Please Enter Your Choice :-");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("");
                    System.out.print("Please enter Number for reverse :- ");
                    num = sc.nextInt();
                    System.out.println("Output is :- " + reverse(num));
                    System.out.println("");
                    break;
                }
                case 2:
                {
                    for(int i=0;i<a.length;i++)
                    {
                        System.out.print("Enter Num"+i+" => ");
                        a[i]=sc.nextInt();
                    }
                    System.out.print("You Enter :- ");
                    for(int x:a)
                    {
                        System.out.print(x+" ");
                    }
                    System.out.println(" ");
                    int b[];
                    b=reverse(a);
                    for(int x:b)
                    {
                        System.out.print(x+" ");
                    }
                }
                case 3: {
                    System.exit(1);
                }
            }
        }
    }
}
