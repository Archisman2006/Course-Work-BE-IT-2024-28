public class q2 extends Thread {
    int i=1;
    Object o=new Object();
    class oddThread extends Thread{
        public void run(){
            synchronized(o){
                while(i<10){
                    if(i%2==0) try{o.wait();} catch(InterruptedException e){}
                    else {
                        System.out.print(i+" "); i++; o.notify();
                    }
                }
            }
        }
    }
    class evenThread extends Thread{
        public void run(){
            synchronized(o){
                while(i<=10){
                        if(i%2==1) try{o.wait();} catch(InterruptedException e){}
                        else {
                            System.out.print(i+" "); i++; o.notify();
                        }
                    }
            }
        }
    }
    public static void main(String[] args) {
        q2 obj=new q2();
        oddThread t1=obj.new oddThread();
        evenThread t2=obj.new evenThread();
        t1.start(); t2.start();
    }    
}
