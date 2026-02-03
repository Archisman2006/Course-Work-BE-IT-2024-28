package ass1;
import java.util.ArrayList;
import java.util.List;
class Person{
    int age,weight,height;
    String dateOfBirth,address;
    Person(){}
    Person(int age,int weight,int height,String dateOfBirth,String address){
        this.age=age; this.weight=weight; this.height=height; this.dateOfBirth=dateOfBirth; this.address=address;
    }
    void PrintDetails(){
        System.out.println("age:"+age+" weight: "+weight+" height: "+height+" date-of-birth: "+dateOfBirth+" address: "+address);
    }
}

class Employee extends Person{
    int salary; String dateofJoining; double experience;
    Employee(){}
    Employee(int salary,String dateofJoining,double experience,int age,int weight,int height,String dateOfBirth,String address){
        this.salary=salary; this.dateofJoining=dateofJoining; this.experience=experience;
        super(age,weight,height,dateOfBirth,address);
    }
    void PrintDetails(){
    System.out.println("salary: "+salary+" date-of-joining: "+dateofJoining+" experience: "+experience);
    super.PrintDetails();    
    }
}
class Student extends Person{
int roll; List<String> listOfSubjects; List<Integer> marks;
    Student(int roll,List<String>listOfSubjects,List<Integer>marks,int age,int weight,int height,String dateOfBirth,String address){
        this.roll=roll; this.listOfSubjects=new ArrayList<>(listOfSubjects);
        this.marks=new ArrayList<>(marks);
        super(age,weight,height,dateOfBirth,address);
    }
    int CalculateGrade(){
        int sum=0;
        for(Integer x:marks) sum+=x;
        return sum/marks.size(); 
    }
    void PrintDetails(){
        System.out.println("roll: "+roll); System.out.println("subjects taught: ");
        for(String s:listOfSubjects) System.out.print(s+" ");
        System.out.println("marks in respective subjects: ");
        for(Integer x:marks) System.out.print(x+" ");
        super.PrintDetails();
    }
}
class Technician extends Employee{
    Technician(int salary,String dateOfJoining,double experience,int age,int weight,int height,String dateOfBirth,String address){
        super(salary, dateOfJoining, experience, age, weight, height, dateOfBirth, address);
    }
    @Override
    void PrintDetails() {
        super.PrintDetails();
    }
}
class Professor extends Employee{
    List<String>courses; List<String>listOfAdvisee;
    Professor(List<String>courses,List<String>listOfAdvisee,int salary,String dateOfJoining,double experience,int age,int weight,int height,String dateOfBirth,String address){
        this.courses=new ArrayList<>(courses);
        this.listOfAdvisee=new ArrayList<>(listOfAdvisee);
        super(salary, dateOfJoining, experience, age, weight, height, dateOfBirth, address);
    }
    void add(String name){
        listOfAdvisee.add(name);
    }
    void remove(int i){
        listOfAdvisee.remove(i);
    }
    void PrintDetails() {
        System.out.println("courses taught: ");
        for(String s:courses) System.out.print(s+" ");
        System.out.print("list of advisee: ");
        for(String s:listOfAdvisee) System.out.print(s+" ");
        super.PrintDetails();
    }
}
class Main{
    public static void main(String[] args) {
        List<String>courses=new ArrayList<>(); courses.add("Maths"); courses.add("Physics");
        List<String>listOfAdvisee=new ArrayList<>(); listOfAdvisee.add("Angela"); listOfAdvisee.add("Samuel");
        Professor p1=new Professor(courses,listOfAdvisee,2000000,"01-03-2009",16.10,46,80,180,"14-01-1980","Shyambazar,Kolkata");
        p1.PrintDetails();
        List<String>listOfSubjects=new ArrayList<>(); listOfSubjects.add("physical chemistry"); listOfSubjects.add("biochemistry");
        List<Integer>marks=new ArrayList<>(); marks.add(68); marks.add(50);
        Student s=new Student(89,listOfSubjects,marks,20,90,190,"12-12-2005","mallickbazar");
        System.out.println("calculated grade: "+s.CalculateGrade());
        s.PrintDetails();
    }
}

// Implement a class for a “Person”. Person has data members ‘age’, ’weight’, ‘height’,
// ‘dateOfBirth’, ‘address’ with proper reader/write methods etc. Now create two subclasses
// “Employee” and “Student”. Employee will have additional data member ‘salary’,
// ‘dateOfJoining’, ‘experience’ etc. Student has data members ‘roll’, ‘listOfSubjects’, their marks
// and methods ‘calculateGrade’. Again create two sub-classes “Technician” and “Professor” from
// Employee. Professor has data members ‘courses’, ‘listOfAdvisee’ and their add/remove
// methods. Write a main() function to demonstrate the creation of objects of different classes and
// their method calls.
