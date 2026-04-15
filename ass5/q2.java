package ass5;
//component interface
interface Shape{
    public void draw();
}
//concrete Components
class Circle implements Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
//concrete Components
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}
//abstract Decorator
abstract class ShapeDecorator implements Shape{
    Shape shape;
    ShapeDecorator(Shape shape){
        this.shape=shape;
    }
    public void draw(){
        shape.draw();
    }
}
//concrete decorators
class RedShapeDecorator extends ShapeDecorator{
        int border=0;
        RedShapeDecorator(Shape shape){
            super(shape);
        }
        public void draw(){
            System.out.print("Red "); shape.draw(); 
        }
        private void setRedBorder(int border){
            this.border=border;
        }
}

class decoratorPatternDemo{
    public static void main(String[] args) {
        Shape s=new RedShapeDecorator(new Rectangle());
        s.draw();
    }
}


