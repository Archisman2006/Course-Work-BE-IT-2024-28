public class q3 extends Thread{
    int fact=1; int i=1;
    double sum=0;
    Object o=new Object();
    boolean prepareFact=false;
    class findFact extends Thread{
        public void run(){
            synchronized(o){
                while(i<=10){
                    while(prepareFact){
                        try{o.wait();}catch(InterruptedException e){}
                    }
                    fact=1; for(int j=2;j<=i;j++) fact=fact*j;
                    prepareFact=true;
                    o.notify();
                }
            }
        }
    }
    class findSum extends Thread{
        public void run(){
            synchronized(o){
                while(i<=10){
                    while(!prepareFact){
                        try{o.wait();}catch(InterruptedException e){}
                    }
                    sum=sum+(1.0/fact); i++;
                    prepareFact=false; o.notify();
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        q3 obj=new q3();
        findFact t1=obj.new findFact();
        findSum t2=obj.new findSum();
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("The sum is: "+obj.sum);
    }
}
