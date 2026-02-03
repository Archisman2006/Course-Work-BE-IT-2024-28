package ass1;

class Employee{
    String name; int id; String address; int salary;
    Employee(String name,int id,String address,int salary){
    this.name=name; this.id=id; this.address=address; this.salary=salary;
    }
    String getname(){return name;}
    String address(){return address;}
    int getid(){return id;}
    int getsalary(){return salary;}

}
class Dept{
    String name; String location; Employee[] arr=new Employee[100]; int i=0;
    Dept(String name,String location){
    this.name=name; this.location=location;
    }
    void add(String name,int id,String address,int salary){
    Employee e=new Employee(name, id, address, salary);
    arr[i++]=e;
    }
    void remove(int i){
    arr[i]=null;
    }
    int expenditure(){
    int sum=0;
    for(int k=0;k<i;k++) if(arr[k]!=null) sum+=arr[k].getsalary();
    return sum;
    }
    public static void main(String[] args) {
        Dept it=new Dept("Information Technology","salt lake");
        it.add("Ram",1001,"kolkata",1000000);
        it.add("Amal",1002,"delhi",1200000);
        it.add("Sujan",1003,"guwahati",1500000);
        it.add("Ajoy",1004,"mumbai",900000);
        it.add("Pratyush",1005,"pune",800000);
        System.out.println("yearly expenditure: "+it.expenditure());
    }
}

// Write a Java class “Employee” containing information name, id, address, salary etc. Write
// necessary constructor and read/write methods.
// Create a class “Dept” that has a name, location etc. The “Dept” contains a number of
// “Employee”. Write methods “add” and “remove” to add and remove an employee to/from this
// department.
// Write a main() function and create “Information Technology” department. Add five employees
// and print yearly expenditure for this department.