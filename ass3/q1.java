    package ass3;
    public class q1{
    static <T extends Comparable<T>> void sort(T arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0) {
                    T temp=arr[j+1]; arr[j+1]=arr[j]; arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,4,2,1,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String arr1[]={"mango","banana","apple","berry"};
        sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}
