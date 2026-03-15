public class q6 extends Thread{
    int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    int x=30;
    class BinarySearch extends Thread{
        int id;
        BinarySearch(int id){
            this.id=id;
        }
        public void run(){
            int s=(id-1)*10,e=(id*10)-1,mid;
            while(s<=e){
                mid=(s+e)/2;
                if(arr[mid]==x) {System.out.println(x+" found in Thread "+id+" at index "+mid); break;}
                else if(arr[mid]>x) e=mid-1;
                else s=mid+1;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        q6 obj=new q6();
        int n=obj.arr.length;
        for(int i=1;i<=(n/10);i++){
            BinarySearch t=obj.new BinarySearch(i);
            t.start(); t.join();
        }
    }
}
