package ass1;

class BankAccount{
    int AccountNumber; double balance; String ownerName;
    BankAccount(int AccountNumber,double balance,String ownerName){
    this.AccountNumber=AccountNumber; this.balance=balance; this.ownerName=ownerName;
    }
    double balance(){
    return balance;    
    }
    void add(double x){
    balance+=x;
    }
    void subtract(double x){
    balance-=x;
    }
    void PrintDetails(){
        System.out.println("Account Number: "+AccountNumber+" Balance: "+balance+" Owner Name: "+ownerName);
    }
}

class AccountManager{
    BankAccount[] arr=new BankAccount[100]; int i=0;
    void create(int AccountNumber,double balance,String ownerName){
    BankAccount b=new BankAccount(AccountNumber, balance, ownerName);
    arr[i++]=b;
    }
    void delete(int i){
    arr[i]=null;
    }
    void deposit(int i,double x){
    arr[i].add(x);
    }
    void withdraw(int i,double x){
    arr[i].subtract(x);    
    }
    void PrintDetails(){
        for(int k=0;k<i;k++) arr[k].PrintDetails();
    }
}
class Bank{
    public static void main(String[] args) {
        AccountManager a1=new AccountManager();
        a1.create(1001,9800,"Ram");
        a1.create(1002,7800, "Shyam");
        a1.create(1003,5600,"Karan");
        a1.create(1004, 12000, "Vimal");
        a1.create(1005,19000,"Raj");
        a1.PrintDetails();
    }
}


// Write a class “BankAccount” with the following instance variables:
// AccountNumber (an integer), balance a floating-point number), and “ownerName” (a String).
// Write proper constructor for this class. Also write methods balance, add (to deposit an amount),
// and subtract (to withdraw an amount) and implement them. Now create another class
// “AccountManager” that contains an array of BankAccount. Write methods create (to create an
// account), delete(to terminate an account), deposit (to deposit an amount to an account) and
// withdraw (to withdraw an amount from an account). Also write a class “Bank”, add main()
// function that creates an AccountManager and add 5 accounts. Now print the details of all
// accounts in this Bank.