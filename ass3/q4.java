package ass3;

import java.lang.reflect.*;
public class q4 {
    int x;
    private int y;
    q4(int x,int y){
        this.x=x; this.y=y;
    }
    void print(){
        System.out.println("hello world");
    }
    void show(){
        System.out.println("show function");
    }
    private void fun(){
        System.out.println("inside private method");
    }
    public static void main(String[] args) throws Exception {
        q4 ob=new q4(2,1);
        Class<?> c1=ob.getClass();
        System.out.println(c1.getName());
        System.out.println("getMethods()-->");
        Method[] methods=c1.getMethods();
        for(Method m: methods){
            System.out.println(m.getName());
        }
        Method[] allmethods=c1.getDeclaredMethods();
        System.out.println("getDeclaredMethods()-->");
        for(Method m:allmethods){
            System.out.println(m.getName());
        }
        Field y=c1.getDeclaredField("y");
        System.out.println(y);
        Method m1=c1.getDeclaredMethod("fun");
        m1.setAccessible(true);
        m1.invoke(ob);
        System.out.println(m1);
        Class<?>c2=q4.class;
        Constructor<?>cons=c2.getDeclaredConstructor(int.class,int.class);
        q4 ob1=(q4)cons.newInstance(5,10);
        ob1.print();
    }
}
