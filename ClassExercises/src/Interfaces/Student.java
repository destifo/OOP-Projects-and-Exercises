package Interfaces;

public class Student extends Person {
    private String course;

    public Student(String name){
        super(name);
    }

    public Student(String n, String c){
        super(n);
        course = c;
    }

    public String getCourse(){
        return course;
    }

    public String description(){
        return "Student with a name " + super.getName() +  "learning " + getCourse();
    }

}
