package ass1;

class Student1{
    String name; int rollno; String[] subjects=new String[5];
    Student1(String name,int rollno,String[] subjects){
        this.name=name; this.rollno=rollno; this.subjects=subjects;
    }
    String getName(){return name;}
    int getRollNo(){return rollno;}
    String[] getSubjects(){return subjects;}
}
class TabulationSheet{
    String subject; int[] roll=new int[3]; int[] marks=new int[3];
    TabulationSheet(String subject,int[]roll,int[]marks){
        this.subject=subject; this.roll=roll; this.marks=marks;
    }
}
class MarkSheet{
    Student1 s; int[]marks=new int[5];
    MarkSheet(Student1 s,int[] marks){
    this.s=s; this.marks=marks;
    }
    void Print(){
    System.out.println("MARKSHEET FOR: "+s.getName());
    String[] subjects=s.getSubjects(); System.out.println("SUBJECT: MARKS");
    for(int i=0;i<5;i++) {System.out.println(subjects[i]+" "+marks[i]);}
    }
    public static void main(String[] args) {
    String[] subjects=new String[]{"Maths","Physics","Chemistry","Biology","Computer Science"};
    Student1 s1=new Student1("Rakesh",101,subjects);
    Student1 s2=new Student1("Mohan",102,subjects);
    Student1 s3=new Student1("Anjali",103,subjects);
    // int[]roll=new int[]{101,102,103};
    // TabulationSheet t1=new TabulationSheet("Maths", roll, new int[]{89,99,78});
    // TabulationSheet t2=new TabulationSheet("Physics", roll, new int[]{89,99,78});
    // TabulationSheet t3=new TabulationSheet("Chemistry", roll, new int[]{89,99,78});
    // TabulationSheet t4=new TabulationSheet("Biology", roll, new int[]{89,99,78});
    // TabulationSheet t5=new TabulationSheet("Computer Science", roll, new int[]{89,56,98});
    MarkSheet m1=new MarkSheet(s1, new int[]{56,45,78,90,81});
    MarkSheet m2=new MarkSheet(s2, new int[]{65,75,38,50,91});
    MarkSheet m3=new MarkSheet(s3, new int[]{55,49,70,80,51});
    m1.Print(); m2.Print(); m3.Print();
    }
}

//  Implement a class for a “Student”. Information about a student includes name, roll no and an array
// of five subject names. The class should have suitable constructor and get/set methods.
// Implement a class “TabulationSheet”. A tabulation sheet contains roll numbers and marks of each
// student for a particular subject. This class should have a method for adding the marks and roll no
// of a student.
// Implement a class “MarkSheet”. A mark sheet contains marks of all subjects for a particular
// student. This class should have a method to add name of a student and marks in each subject.
// Write a main() function to create three “Student” objects, Five “Tabulationsheet” objects for Five
// subjects and three “Marksheet” object for three students. Print the mark sheets.