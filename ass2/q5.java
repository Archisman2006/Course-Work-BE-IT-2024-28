public class q5 extends Thread {
    int sum=0; int i=1;
    Object o=new Object();
    class oddThread extends Thread{
        public void run(){
            while(i<100){
                synchronized(o){
                    while(i%2==0){
                        try{o.wait();}catch(InterruptedException e){}
                    }
                    sum+=i; i++; o.notify();
                }
            }
        }
    }
    class evenThread extends Thread{
        public void run(){
            while(i<=100){
                synchronized(o){
                    while(i%2==1){
                        try{o.wait();}catch(InterruptedException e){}
                    }
                    sum+=i; i++; o.notify();
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        q5 obj=new q5();
        oddThread t1=obj.new oddThread();
        evenThread t2=obj.new evenThread();
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Sum is: "+obj.sum);
    }
}
