class mythread extends Thread{

    public mythread(String name){
        super(name);
        setPriority(Thread.NORM_PRIORITY+2);
    }

    public void run(){
        int i=0;

        while(true){
            System.out.println(i+" hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                System.out.println(e);
            }
            i++;
        }
    }

}


public class client {

    public static void main(String[] args) {
        mythread m=new mythread("this is first");
        // // m.setPriority(10);
        // System.out.println(m.getId());
        // System.out.println(m.getName());
        // System.out.println(m.getPriority());
        // m.start();
        // System.out.println(m.getState());
        // System.out.println(m.isAlive());

        m.run();

    }

}
