
package com.ahmed.console;

public class Course {
    private String courseName;
    private String courseCode;
    
    public Course(){
        
        
        
    }
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseInt(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }


    public String getInfo() {
        return "Course{" + "Course Name = " + getCourseName() + ", Course Code = " + getCourseCode() + '}';
    }

    

    
}
