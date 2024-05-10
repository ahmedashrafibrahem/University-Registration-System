
package com.ahmed.console;
import java.util.ArrayList;
public class Lecturer extends Person {
    private String lecturer_ID;
    private ArrayList<Course> coursesTeaching = new ArrayList<>();
    public Lecturer(String name,String lecturer_ID) {
        super(name);
        this.lecturer_ID = lecturer_ID;
    }

    public void setLecturer_ID(String lecturer_ID) {
        this.lecturer_ID = lecturer_ID;
    }

    public String getLecturer_ID() {
        return lecturer_ID;
    }
    
    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public ArrayList<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public String getInfo() {
        return "Lecturer{" + "Lecturer Name= " + getName() +
               ",Lecturer ID=" + getLecturer_ID() + '}';
    }
    
}
