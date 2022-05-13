public class email {
    
    String username(String email)
    {
        int a=email.indexOf('@');
        String name=email.substring(0, a);
        return name;
    }

    public static void main(String args[])
    {
        email em=new email();
        String email="jypatel@gmail.com";
        String uname;
        uname=em.username(email);
        System.out.println("User Name is :- "+uname);
    }

}
