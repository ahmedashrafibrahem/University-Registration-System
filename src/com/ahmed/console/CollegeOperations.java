
package com.ahmed.console;

public interface CollegeOperations {
    void addCourse   (Course   course);
    void addStudent  (Student  student);
    void addLecturer (Lecturer lecturer);
    void registerCourseForStudent(String student_ID  , String courseCode );
    void registerCourseForLecturer(String lecturer_ID, String courseCode);
    void displayCollegeInformation();
    void displayAllCourses();
    void displayAllStudents();
    void displayAllLecturers();
    void displayCoursesForStudent(String studentID);
    void displayCoursesForLecturer(String lecturer_ID);
}
