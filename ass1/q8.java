package ass1;

class Account{
    int accountNumber; String holdername; double balance;
    Account(){}
    Account(int accountNumber,String holdername,double balance){
        this.accountNumber=accountNumber;
        this.holdername=holdername;
        this.balance=balance;
    }
    void PrintDetails(){
        System.out.println("Holder Name: "+holdername+" Account Number: "+accountNumber+" Balance: "+balance);
    }
    double getbalance(){
        return balance;
    }
}
class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(double interestRate,int accountNumber,String holdername,double balance){
        this.interestRate=interestRate;
        super(accountNumber,holdername,balance);
    }
    double calculateYearlyInterest(){
    return 0.01*interestRate*super.getbalance(); 
    }
}
class CurrentAccount extends Account{
CurrentAccount(int accountNumber,String holdername,double balance){
    super(accountNumber, holdername, balance);
}
}
class Manager{
    Account[] arr=new Account[100]; int i=0;
    void add(SavingsAccount s){
        arr[i++]=s;
    }
    void add(CurrentAccount c){
        arr[i++]=c;
    }
    double calculateYearlyInterest(int k){
    if(arr[k] instanceof SavingsAccount) return ((SavingsAccount) arr[k]).calculateYearlyInterest();
    else return 0.0;
    }
    void PrintDetails(){
    for(int k=0;k<i;k++) arr[k].PrintDetails();
    }
    public static void main(String[] args) {
        Manager m=new Manager();
        SavingsAccount s1=new SavingsAccount(5,101,"mukesh",100000);
        SavingsAccount s2=new SavingsAccount(7,102,"nita",200000);
        CurrentAccount c1=new CurrentAccount(103,"ajoy",50000);
        CurrentAccount c2=new CurrentAccount(104,"smriti",150000);
        CurrentAccount c3=new CurrentAccount(105,"karen",90000);
        m.add(s1); m.add(s2); m.add(c1); m.add(c2); m.add(c3);
        System.out.println(m.calculateYearlyInterest(0));
        System.out.println(m.calculateYearlyInterest(1));
        m.PrintDetails();
    }
}

// Write a class for “Account” containing data members ‘accountNumber’, ‘holderName’,
// ‘balance’ and add constructors and necessary accessor/modifier functions for these data
// members. Now create two class “SavingsAccount” and “CurrentAccount” extending from this
// class. SavingsAccount will have a member variable ‘interestRate’ and member function
// ‘calculateYearlyInterest’. Write another class “Manager” that contains a list Account. Also write
// a main() function to create an instance of Manager class. Add two SavingsAccount and three
// CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print the details of all
// accounts.