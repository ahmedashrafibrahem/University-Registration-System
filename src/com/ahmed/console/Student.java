
package com.ahmed.console;

import java.util.ArrayList;
public class Student extends Person{
    private String student_ID;
    private ArrayList<Course> coursesTaken;;
    public Student() {
    }

    public Student(String name,String student_ID) {
        super(name);
        this.student_ID = student_ID;
        this.coursesTaken = new ArrayList<>();
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    
    public void addCourse(Course course) {
        coursesTaken.add(course);
    }
    

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }



    public String getInfo() {
        return "Student{" +"Student Name = " + getName() +
                ", Student ID = " + student_ID + 
                "" 
                 + '}';
    }
    
    
    
    
    
}
