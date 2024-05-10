
package com.ahmed.console;
import java.util.ArrayList;
public class College implements CollegeOperations {
    ArrayList <Course>   courses  = new ArrayList <>();
    ArrayList <Student>  students = new ArrayList <>();
    ArrayList <Lecturer> lecturers = new ArrayList <>();
    //College1
    @Override
    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    @Override
    public void registerCourseForStudent(String student_ID, String courseCode) {
        // Find the student
    Student student = null;
    for (Student s : students) {
        if (s.getStudent_ID().equals(student_ID)) {
            student = s;
            break;
        }
    }

//    Student student = null;
//    for (int i = 0; i < students.size(); i++) {
//    Student s = students.get(i);
//        if (s.getStudent_ID().equals(student_ID)) {
//        student = s;
//        break;
//        }
//    }
    
    
    
    
    
    // Find the course
    Course course = null;
    for (Course c : courses) {
        if (c.getCourseCode().equals(courseCode)) {
            course = c;
            break;
        }
    }

    // Check if both student and course are found
    if (student != null && course != null) {
        // Add the course to the student's list of courses
        student.addCourse(course);
        System.out.println("Course " + courseCode + " registered successfully for student " + student_ID);
    } else {
        System.out.println("Failed to register course for student. Student or course not found.");
    }
    }

    @Override
    public void registerCourseForLecturer(String lecturer_ID, String courseCode) {
       Lecturer lecturer = null;
    for (Lecturer l : lecturers) {
        if (l.getLecturer_ID().equals(lecturer_ID)) {
            lecturer = l;
            break;
        }
    }

    Course course = null;
    for (Course c : courses) {
        if (c.getCourseCode().equals(courseCode)) {
            course = c;
            break;
        }
    }

    if (lecturer != null && course != null) {
        lecturer.addCourse(course);
        System.out.println("Course registered for lecturer successfully.");
    } else {
        System.out.println("Lecturer or course not found.");
    }
    }

    @Override
    public void displayCollegeInformation() {
        System.out.println("College Information:");
        System.out.println("Total Courses: " + courses.size());
        System.out.println("Total Students: " + students.size());
    System.out.println("Total Lecturers: " + lecturers.size());
    }

    @Override
    public void displayAllCourses() {
        System.out.println("All Courses:");
            for (Course course : courses) {
            System.out.println(course.getInfo());
            }
    }

    @Override
    public void displayAllStudents() {
        System.out.println("All Students:");
         for (Student student : students) {
         System.out.println(student.getInfo());
         }
    }

    @Override
    public void displayAllLecturers() {
       System.out.println("All Lecturers:");
            for (Lecturer lecturer : lecturers) {
            System.out.println(lecturer.getInfo());
            }
    }

    @Override
    public void displayCoursesForStudent(String studentID) {
        // Find the student
    Student student = null;
    for (Student s : students) {
        if (s.getStudent_ID().equals(studentID)) {
            student = s;
            break;
        }
    }

    // If student is found, display their courses
    if (student != null) {
        System.out.println("Courses for Student ID: " + studentID);
        ArrayList<Course> coursesTaken = student.getCoursesTaken();
        if (coursesTaken.isEmpty()) {
            System.out.println("No courses taken.");
        } else {
            for (Course course : coursesTaken) {
                System.out.println(course.getInfo());
            }
        }
    } else {
        System.out.println("Student not found with ID: " + studentID);
    }
    }

    @Override
    public void displayCoursesForLecturer(String lecturer_ID) {
       // Find the lecturer
    Lecturer lecturer = null;
    for (Lecturer l : lecturers) {
        if (l.getLecturer_ID().equals(lecturer_ID)) {
            lecturer = l;
            break;
        }
    }

    // If lecturer is found, display their courses
    if (lecturer != null) {
        System.out.println("Courses taught by Lecturer ID: " + lecturer_ID );
        ArrayList<Course> coursesTeaching = lecturer.getCoursesTeaching();
        if (coursesTeaching.isEmpty()) {
            System.out.println("No courses taught.");
        } else {
            for (Course course : coursesTeaching) {
                System.out.println(course.getInfo());
            }
        }
    } else {
        System.out.println("Lecturer not found with ID: " + lecturer_ID);
    }
    }
}
