package ass1;

interface Shape{
    double area();
    void draw();
    void rotate();
    void move(int a,int b);
    void PrintDetails();
}
class Circle implements Shape{
    int x,y; double radius;
    Circle(int x,int y,double radius){this.x=x; this.y=y; this.radius=radius;}
    public double area(){return Math.PI*radius*radius;}
    public void draw(){System.out.println("Draw function invoked.");}
    public void rotate(){System.out.println("Rotate function invoked.");}
    public void move(int x1,int y1){x+=x1; y+=y1;}
    public void PrintDetails(){
        System.out.println(" x: "+x+" y: "+y+ " radius: "+radius);
    }
}
class Rectangle implements Shape{
    int length,breadth; int x,y;
    Rectangle(int x,int y,int length,int breadth){this.x=x; this.y=y; this.length=length; this.breadth=breadth;}
    public double area(){return length*breadth;}
    public void draw(){System.out.println("Draw function invoked.");}
    public void rotate(){System.out.println("Rotate function invoked.");}
    public void move(int x1,int y1){x+=x1; y+=y1;}
    public void PrintDetails(){
        System.out.println(" x: "+x+" y: "+y+" length: "+length+" breadth: "+breadth);
    }
}
class AnotherClass{
    
    public static void main(String[] args) {
        Circle c1=new Circle(0,0,4);
        // c2=new Circle(3,6,2);
    Rectangle r1=new Rectangle(2,5,4,5);
    // r2=new Rectangle(5,6,3,4),r3=new Rectangle(0,0,8,8);
        System.out.println("Before moving circle->"); c1.PrintDetails(); c1.move(4, 4);
        System.out.println("after moving circle->"); c1.PrintDetails();
        System.out.println("before moving rectangle->"); r1.PrintDetails(); r1.move(3,3);
        System.out.println("after moving circle->"); r1.PrintDetails();
    }
}
// Implement the classes for the following inheritance hierarchies.
// Create an interface “Shape” that contains methods ‘area’, ‘draw’, ‘rotate’, ‘move’ etc. Now create
// two classes “Circle” and “Rectangle” that implement this ‘Shape’ interface and implement the
// methods ‘area’, ‘move’, etc. Write a main() function to create two “Circle” and three “Rectangle”,
// then move them. Print the details of circles and rectangles before after moving them