class myt implements Runnable{
    public int i=1;
    public void run(){
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class client {
    
    public static void main(String[] args) {
        myt m=new myt();
        Thread t=new Thread(m);
        t.start();

        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }

}
