package ass3;

import java.util.HashMap;
import java.util.Map;

public class q3 {
    static <T> void fun(T arr[]){
        Map<T,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        System.out.println("The duplicate elements are: ");
        for(Map.Entry<T,Integer>entry:mp.entrySet()){
            if(entry.getValue()>1) System.out.print(entry.getKey()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={1,7,4,3,2,6,5,3,9,9,1,1,1};
        fun(arr);
    }
}
