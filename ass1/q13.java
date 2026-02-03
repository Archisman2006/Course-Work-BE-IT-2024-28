package ass1;

class Automobile{
    String make,type,registrationNumber; int maxSpeed,price,mileage;
    Automobile(){}
    Automobile(String make,String type,String registrationNumber,int maxSpeed,int price,int mileage){
        this.make=make; this.type=type; this.registrationNumber=registrationNumber; this.maxSpeed=maxSpeed; this.price=price; this.mileage=mileage;
    }
    void PrintDetails(){
        System.out.print(" make: "+make+" type: "+type+" registration number: "+registrationNumber+" max speed: "+maxSpeed+" price: "+price+" mileage: "+mileage);
        System.out.println();
    }
}
class Track extends Automobile{
    int capacity; String hoodType; int noOfwheels;
    Track(int capacity,String hoodType,int noOfWheels,String make,String type,String registrationNumber,int maxSpeed,int price,int mileage){
        this.capacity=capacity; this.hoodType=hoodType; this.noOfwheels=noOfWheels;
        super(make,type,registrationNumber,maxSpeed,price,mileage);
    }
    void PrintDetails(){
        System.out.print(" capacity: "+capacity+" noOfWheels: "+noOfwheels);
        super.PrintDetails();
    }
}
class Car extends Automobile{
    int noOfDoors,seatingCapacity;
    Car(int noOfDoors,int seatingCapacity,String make,String type,String registrationNumber,int maxSpeed,int price,int mileage){
        this.noOfDoors=noOfDoors; this.seatingCapacity=seatingCapacity;
        super(make,type,registrationNumber,maxSpeed,price,mileage);
    }
    void PrintDetails(){
        System.out.print(" noOfDoors: "+noOfDoors+" seating capacity: "+seatingCapacity);
        super.PrintDetails();
    }
}
class DemoClass{
    public static void main(String[] args) {
        Car c=new Car(4,5,"Toyota","Sedan","WB-70-2369",190,1000000,20);
        Track t=new Track(5,"sloped",4,"BMW","Hatchback","WB-67-0787",250,4000000,15);
        c.PrintDetails();
        t.PrintDetails();
    }
}

// Create a base class “Automobile”. An Automobile contains data members ‘make’, ‘type’,
// ‘maxSpeed’, ‘price’, ‘mileage’, ‘registrationNumber’ etc. with their reader/writer methods. Now
// create two sub-classes “Track” and “Car”. Track has data members ‘capacity’, ‘hoodType’,
// ‘noOfWheels’ etc. Car has data members ‘noOfDoors’, ‘seatingCapacity’ and their reader/writer
// methods. Create a main() function to demonstrate this.
