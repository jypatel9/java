class car
{
    public void startcar(){
        System.out.println("Car is start.");
    }
    public void accelerate(){
        System.out.println("Car is accelerate.");
    }
    public void changegar(){
        System.out.println("Car gear change.");
    }
}
class automatecar extends car
{
    public void changegar(){
        System.out.println("Car gear is automatic.");
    }
    public void sunroof(){
        System.out.println("Sunroof is open.");
    }
}

public class four {
    public static void main(String args[])
    {
        automatecar a=new automatecar();
        a.startcar();
        a.accelerate();
        a.changegar();
        a.sunroof();
    }
}
