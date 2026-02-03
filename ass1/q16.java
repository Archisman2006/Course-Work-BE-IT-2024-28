package ass1;

interface Fruit{
    boolean hasAPeel();
}
interface Vegetable{
    boolean hasARoot();
}
class Tomato implements Fruit,Vegetable{
    public boolean hasAPeel(){
        return true;
    }
    public boolean hasARoot(){
        return false;
    }
    void PrintDetails(){
        System.out.println("Does it has a peel: "+(hasAPeel()?"yes":"no"));
        System.out.println("Does it has a root?"+(hasARoot()?"yes":"no"));
    }
    public static void main(String[] args) {
        Tomato t=new Tomato(); t.PrintDetails();
    }
}
// Write two interfaces “Fruit” and “Vegetable” containing methods ‘hasAPeel’ and ‘hasARoot’.
// Now write a class “Tomato” implementing Fruit and Vegetable. Instantiate an object of Tomato.
// Print the details of this object.
