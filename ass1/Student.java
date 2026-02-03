package ass1;
public class Student{
    String name; int marks[];
    Student(String name,int marks1,int marks2,int marks3){
    this.name=name;
    marks=new int[]{marks1,marks2,marks3};
    }
    double average(){
    return (marks[0]+marks[1]+marks[2])/3;
    }
    void display(){
    System.out.println("name:"+name);
    int total_marks=0;
    for(int x:marks) {total_marks+=x;}
    System.out.println("marks:"+total_marks); 
    }
    public static void main(String[] args) {
    Student s1=new Student("ram",88,56,99);
    System.out.println(s1.average());
    s1.display();
}
}
