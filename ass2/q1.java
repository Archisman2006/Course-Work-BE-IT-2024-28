class ChildThread extends Thread{
    public void run(){
        System.out.println("in child thread");
    }
}
public class q1{
    public static void main(String[] args) {
        System.out.println("in main thread");
        ChildThread t1=new ChildThread();
        t1.start();
    }
}
