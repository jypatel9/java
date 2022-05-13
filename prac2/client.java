class one {

    private int roll_no;
    private String name;

    public one(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public void setdata(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public int getrollno() {
        return roll_no;
    }

    public String getname() {
        return name;
    }
}

class student extends one {
    public char div;

    public student(int roll_no, String name, char div) {
        super(roll_no, name);
        this.div = div;
    }

    public void setdiv(char div) {
        this.div = div;
    }

    public char getdiv() {
        return div;
    }

    public void display() {
        System.out.println(getrollno());
        System.out.println(getname());
        System.out.println(getdiv());
    }
}

public class client {

    public static void main(String[] args) {
        student s1 = new student(12,"jay",'a');
        s1.display();
    }

}
