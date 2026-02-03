package ass1;
class Stack{
    int[] arr;int top;
    Stack(int size){
        arr=new int[size]; top=-1;
    }
    void push(int x){
        arr[++top]=x;
    }
    int pop(){
        return arr[top--];
    }
    void print(){
        for(int i=top;i>=0;i--) System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Stack s=new Stack(30);
        s.push(10); s.push(20); s.push(30); s.push(15); s.push(9);
        s.print();
        s.pop(); s.pop(); s.pop();
        s.print();
    }
}