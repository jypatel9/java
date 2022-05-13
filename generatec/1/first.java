import java.util.*;
import java.util.Date;

class student
{
    private String rollno;
    private static int count=1;
    private String generaterollnum()
    {
        Date d=new Date();
        String rn="Univ-"+2022+"-"+count;
        count++;
        return rn;
    }
    public student()
    {
        rollno=generaterollnum();
    }
    public String getrollnum()
    {
        return rollno;
    }
}
public class first {
    public static void main(String args[])
    {
        student s1=new student();
        System.out.println("roll number : "+s1.getrollnum());
        student s2=new student();
        System.out.println("roll number : "+s2.getrollnum());
    }
}
