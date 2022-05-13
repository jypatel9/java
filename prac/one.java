interface disp {
    void display();
}
class exmp1{
    public void display(){
        System.out.println("hello world");
    }
}

class client extends exmp1 implements disp{

    public void display(){
        System.out.println("Hello world");
    }
    
}

public class one{
    public static void main(String[] args) {
        client o=new client();
        System.out.println(o.display());
    }
}
