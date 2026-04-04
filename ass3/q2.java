package ass3;
import java.util.HashMap;
import java.util.Map;

public class q2 {
    static <T> void fun(T arr[]){
        Map<T,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        System.out.println("key"+"   "+"frequency");
        for(Map.Entry<T,Integer>entry:mp.entrySet()){
            System.out.println(entry.getKey()+"      "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,1,4,3,4,5,3,6,3,3};
        fun(arr);
    }
}
