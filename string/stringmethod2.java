class stringmethod2
{
    public static void main(String args[])
    {
        String str="programmer@gmail.com";
        int index=str.indexOf('@');
        String uname=str.substring(0,index);
        String domain=str.substring(index+1,str.length());

        System.out.println("username :- "+uname);
        System.out.println("domain name :- " + domain);

        System.out.println(domain.startsWith("gmail"));
    }
}