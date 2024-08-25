import java.awt.*;

public class Student {
    String name;
    int age;
    String rollno;

    String address;

    public Student(String name, int age, String rollno, String address) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student details:-" +
                "{name: "+ name +", age: " + age + ", rollno: " + rollno + ", address: "+ address +" }";
    }

    public static void main(String[] args) {
        Student newstudent = new Student("Sonu Yadav", 20, "A569", "C-297, NAN, Delhi - 96");
        System.out.println(newstudent);

        //if we don't define tostring call in our programmme it will show like object:- Student_newstudent@89djdeej
    }

}
