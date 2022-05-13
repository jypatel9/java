import java.util.Scanner;

public class websiteprotofind {
    
    public static void main(String args[])
    {
        String url;
        Scanner sc=new Scanner(System.in);

        System.out.print("please enter URL :- ");
        url=sc.next();

        String protocol=url.substring(0,url.indexOf(":"));

        if(protocol.equals("http"))
        {
            System.out.println("hypertext transfer protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("file transfer protocol");
        }

        String ext=url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com"))
        {
            System.out.println("Comercials");
        }
        else if(ext.equals("org"))
        {
            System.out.print("organatizion");
        }
        else if(ext.equals("gov"))
        {
            System.out.println("government");
        }
        else if(ext.equals("net"))
        {
            System.out.println("network");
        }
    }

}
