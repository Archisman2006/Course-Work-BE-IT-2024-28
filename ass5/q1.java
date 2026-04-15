package ass5;

import java.util.Scanner;

interface Shape{
    public void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("Square");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}
class ShapeFactory{
    public Shape getShape(int i) throws Exception{
        switch(i){
            case 1:
                return new Circle();
            case 2:
                return new Square();
            case 3:
                return new Rectangle();
            default:
                throw new Exception();
            }
    }
}
class FactoryPatternDemo{
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Press y to create Shape.");
            char c=sc.next().charAt(0);
            sc.nextLine();
            if(c=='y'){  
            try{
                System.out.println("Type 1 for Circle, 2 for Square, 3 for Rectangle:");
                int k=sc.nextInt(); sc.nextLine();
                Shape newShape=factory.getShape(k);
                newShape.draw();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else {System.out.println("Program Terminating..."); break;}
    }
    sc.close();
    }
}

