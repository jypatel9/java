class student
{
    private int rollNo;
    private String stuName;
    private String stuDepartment;
    private String subject[]=new String[3];

    public student(int rno,String sname,String sdep)
    {
        this.rollNo=rno;
        this.stuName=sname;
        this.stuDepartment=sdep;
    }

    public void setsubject(String... sub)
    {
        for(int i=0;i<sub.length;i++)
        {
            subject[i]=sub[i];
        }
    }

    public int getrollNo(){return rollNo;}
    public String getstuName(){return stuName;}
    public String getstuDepartment(){return stuDepartment;}
    public String[] getsubject(){return subject;}

    public String toString()
    {
        String sub="";
        for(String s:subject)
            sub+=s+"\n";
        
        return "\n Student Roll No. : "+rollNo+"\n Student Name : "+stuName+"\n Student Department : "+stuDepartment+"\n Subject : \n"+sub;
    }

}

public class exm {
    
    public static void main(String args[])
    {
        student s[]=new student[3];
        s[0]=new student(11, "ABC", "MECHANICAL");
        s[1]=new student(101, "xyz", "COMPUTER SCIENCE");
        s[2]=new student(22, "pqr", "ARTS");

        // int subg1[]={50,55,60};
        // int subg2[]={60,45,80};
        // int subg3[]={70,65,40};

        s[0].setsubject("c","c++","java");
        s[1].setsubject("oops","dbms","oracle");
        s[2].setsubject("php","ruby","asp.net");

        for(student s1:s)
        {
            System.out.println(s1);
        }
    }

}
