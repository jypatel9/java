class student
{
    public int roll_Num;
    public String Name;
    public String Course;
    public int sub1,sub2,sub3;

    public int total()
    {
        return sub1+sub2+sub3;
    }
    public int avg()
    {
        return total()/3;
    }
    public char grade()
    {
        if(avg()>70)
        {
            return 'A';
        }
        else
        {
            return 'B';
        }
    }

    public String toString()
    {
        return "\t"+"Roll No: "+roll_Num+"\n \t"+"Name: "+Name+"\n \t"+"Course: "+Course+"\n \t";
    }
}

public class third {
    
    public static void main(String args[])
    {
        student stu1=new student();
        stu1.roll_Num=101;
        stu1.Name="jay desai";
        stu1.Course="CS";
        stu1.sub1=55;
        stu1.sub2=65;
        stu1.sub3=80;

        // System.out.println("Student Roll Number : "+stu1.roll_Num);
        // System.out.println("Student Name        : "+stu1.Name);
        // System.out.println("Student Course      : "+stu1.Course);
        System.out.println("Student Sub1 marks  : "+stu1.sub1);
        System.out.println("Student Sub2 marks  : "+stu1.sub2);
        System.out.println("Student Sub3 marks  : "+stu1.sub3);
        System.out.println("");
        System.out.println("Total Sum           : "+stu1.total());
        System.out.println("Total avarage       : "+stu1.avg()+"%");
        System.out.println("Your Grade          : "+stu1.grade());
        System.out.println("");
        System.out.println("Student Details : ");
        System.out.println(stu1);
    }

}
