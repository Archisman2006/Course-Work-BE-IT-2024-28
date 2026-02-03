package ass1;

class Publication{
    int noOfPages,price; String publisherName;
    Publication(){}
    Publication(int noOfPages,int price,String publisherName){
    this.noOfPages=noOfPages; this.price=price; this.publisherName=publisherName;
    }
    void PrintDetails(){
    System.out.println("No. of pages: "+noOfPages+" Price: "+price+" Publisher name: "+publisherName);
    }
}
class Book extends Publication{
Book(int noOfPages,int price,String publisherName){
    super(noOfPages,price,publisherName); 
}
void PrintDetails(){
    super.PrintDetails();
}
}
class Journal extends Publication{
Journal(int noOfPages,int price,String publisherName){
    super(noOfPages,price,publisherName); 
}
void PrintDetails(){
    super.PrintDetails();
}
}
class Library{
    Publication[] arr=new Publication[100]; int i=0;
    void add(Book b){
    arr[i++]=b;
    }   
    void add(Journal j){
    arr[i++]=j;
    }
    void PrintDetails(){
    for(int k=0;k<i;k++) arr[k].PrintDetails();
    }
    public static void main(String[] args) {
        Book b1=new Book(100,50,"penguin"),b2=new Book(250,300,"penguin"),b3=
        new Book(150, 300, "Pearson");
        Journal j1=new Journal(201,399,"NY Times"),j2=new Journal(401,300,"Times Of India");
        Library l1=new Library(); l1.add(b1); l1.add(b2); l1.add(b3); l1.add(j1); l1.add(j2); 
        l1.PrintDetails();
    }

}
// Create an abstract class “Publication” with data members ‘noOfPages’, ‘price’, ‘publisherName’
// etc. with their accessor/modifier functions. Now create two sub-classes “Book” and “Journal”.
// Create a class Library that contains a list of Publications. Write a main() function and create
// three Books and two Journals, add them to library and print the details of all publications.
