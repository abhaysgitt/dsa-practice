import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentClassDemo {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

        
        String[] names = new String[5];

        
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        



        Student abhay = new Student(15, "Abhay Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);










        System.out.println(abhay.rno);
        System.out.println(abhay.name);
        System.out.println(abhay.marks);

        Student random = new Student(abhay);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}



class Student {
    int rno;
    String name;
    float marks = 90;

    
    

    

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        
        
        this (13, "default person", 100.0f);
    }


    
    
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
