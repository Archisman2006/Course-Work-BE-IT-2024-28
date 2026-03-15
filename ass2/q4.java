import java.io.File;
import java.util.Scanner;
public class q4 extends Thread{
    boolean read=true; boolean run=true;
    int sum=0; int num=0;
    Object o=new Object();
    class Producer extends Thread{
        public void run(){
            File test=new File("C:\\Users\\USER\\OneDrive\\Desktop\\DSA\\Java\\ass2\\test.txt");
            synchronized(o){
                try{
                Scanner sc=new Scanner(test);
                while(sc.hasNextInt()){
                    while(!read) {
                        try{o.wait();}catch(InterruptedException e){}
                    }
                    num=sc.nextInt(); read=false; o.notify();
                }
                run=false; 
                sc.close();
                }
                catch(Exception e){}
            }
    }
    }
    class Consumer extends Thread{
        public void run(){
            synchronized(o){
                while(run){
                    while(read){
                        try{o.wait();}catch(InterruptedException e){}
                    }
                    sum+=num; read=true; o.notify();
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        q4 obj=new q4();
        Producer p=obj.new Producer();
        Consumer c=obj.new Consumer();
        p.start(); c.start();
        p.join(); c.join();
        System.out.println("The sum: "+obj.sum);
    }
}
