class my extends Thread{
    public void run(){
        
     int i=1;
        while(true){
            System.out.println(i+" hello");
            i++;
        }
    }
}

public class client {
    public static void main(String[] args) {
        my m=new my();
        m.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}
