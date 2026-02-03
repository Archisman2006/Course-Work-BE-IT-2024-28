package ass1;
class Room{
int height,width,breadth;
int Volume(){
    return height*width*breadth;
}
}
class RoomDemo{
    public static void main(String args[]){
    Room r1=new Room(); r1.height=2; r1.width=5; r1.breadth=4;
    System.out.println(r1.Volume());
    }
}