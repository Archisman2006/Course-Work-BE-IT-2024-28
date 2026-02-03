package ass1;

import java.util.ArrayList;
import java.util.List;

class Book{
    String auther,title,publisher; int cost,stock;
    Book(String auther,String title,String publisher,int cost,int stock){
        this.auther=auther; this.title=title; this.publisher=publisher; this.cost=cost; this.stock=stock;
    }
    String getAuther(){return auther;}
    String getTitle(){return title;}
    int getcost(){return cost;}
    int getStock(){return stock;}
}
class Inventory{
    List<Book>booklist;
    Inventory(List<Book>booklist){this.booklist=booklist;}
    void getBook(String auther,String title,int copies){
        boolean f=false;  int i=0; 
        for(Book x:booklist) {if(x.getAuther()==auther && x.getTitle()==title) {f=true; break;} i++;}
        if(f==false) System.out.println("The requested book is not in our stock.");
        else retrieveBooks(i,copies);
    }
    void retrieveBooks(int index,int copies){
    if(booklist.get(index).getStock()>=copies) System.out.println("Total cost required: "+(copies*booklist.get(index).getcost()));
    else System.out.println("Requires copies not in stock");
    }
    public static void main(String[] args) {
        Book b1=new Book("Rabindranath Tagore","Gora","Penguin",350,555);
        Book b2=new Book("Bibhuti Bhusan Bandopadhyay","Pather Pachali","Dey Publishing",167,689);
        List<Book>booklist=new ArrayList<>(); booklist.add(b1); booklist.add(b2);
        Inventory inventory=new Inventory(booklist);
        inventory.getBook("Sukumar Ray","abol tabol", 100);
        inventory.getBook("Rabindranath Tagore","Gora",450);
        inventory.getBook("Bibhuti Bhusan Bandopadhyay", "Pather Pachali", 700);
    }
}

//  A bookshop maintains the inventory of books that are being sold at the shop. The list includes
// details such as author, title, publisher, cost and stock position. Whenever a customer wants a
// book, the sales person inputs the title and author and the system searches the list and displays
// whether it is available or not. If it is not, an appropriate message is displayed. If it is, then the
// system displays the book details and details and requests for the number of copies required. If the
// required copies are available, the total cost of the requested copies is displayed, otherwise the
// message “requires copies not in stock” is displayed. Design a system using a class called “Book”
// with suitable member methods and constructors.