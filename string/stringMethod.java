import java.lang.*;

class stringMethod
{
    public static void main(String args[])
    {
        String str="   WeLcome   ";
        System.out.println("string :- " + str);

        //length
        int length;
        length=str.length();
        System.out.println("length of string is :- " + length);

        //toLowerCase() :- return new string where pointing heap.

        str=new String(str.toLowerCase());
        System.out.println("tolowercase display :- "+str);

        //toUpperCase() :- same as lowercase

        str=new String(str.toUpperCase());
        System.out.println("touppercase display :- "+str);

        //trim() :- remove unneccasary space return sequence of char
        str=new String(str.trim());
        System.out.println("trimming the string :- "+str);


        //substring() :- it return substring user wants
        str=new String(str.substring(2,6));
        System.out.println("substring of :- "+str);

        //string replace() :- replace old char to new char

        str=new String(str.replace('L', 'k'));
        System.out.println("replace e to k = "+str);
    }
}