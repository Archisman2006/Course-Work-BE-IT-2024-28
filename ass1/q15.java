package ass1;

class Tollbooth{
    int not_paid,total_cars,total_amount;
    Tollbooth(int not_paid,int total_cars,int total_amount){
        this.not_paid=not_paid; this.total_cars=total_cars; this.total_amount=total_amount;
    }
    void PrintDetails(){
        System.out.println("The total number of cars passed by without paying: "+not_paid);
        System.out.println("Total number of cars passed by: "+total_cars);
        System.out.println("Total cash collected: "+total_amount);
    }
    public static void main(String[] args) {
        Tollbooth t1=new Tollbooth(5,45,2000);
        t1.PrintDetails();
    }
}

// Imagine a toll booth and a bridge. Cars passing by the booth are expected to pay an amount of Rs.
// 50/- as toll tax. Mostly they do but sometimes a car goes by without paying. The toll booth keeps
// track of the number of the cars that have passed without paying, total number of cars passed by,
// and the total amount of money collected. Execute this with a class called “Tollbooth” and print
// out the result as follows:
// The total number of cars passed by without paying.
// Total number of cars passed by.
// Total cash collected.
