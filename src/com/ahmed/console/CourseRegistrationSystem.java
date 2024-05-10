
package com.ahmed.console;

import java.util.Scanner;
import java.util.InputMismatchException;
public class CourseRegistrationSystem {
    
    private static College college = new College();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            while (true) {
            displayMainMenu();
            try {
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addLecturer();
                    break;
                case 4:
                    registerCourseForStudent();
                    break;
                case 5:
                    registerCourseForLecturer();
                    break;
                case 6:
                    displayCollegeInformation();
                    break;
                case 7:
                    displayAllCourses();
                    break;
                case 8:
                    displayAllStudents();
                    break;
                case 9:
                    displayAllLecturers();
                    break;
                case 10:
                    displayCoursesForStudent();
                    break;
                case 11:
                    displayCoursesForLecturer();
                    break;
                case 12:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 12.");
            } 
        }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
                continue; // Go back to the beginning of the loop
        }
        }  
    }
    private static void displayMainMenu() {
        System.out.println("Course Registration System Main Menu:");
        System.out.println("1. Add a course");
        System.out.println("2. Add a student");
        System.out.println("3. Add a lecturer");
        System.out.println("4. Register a course for a student");
        System.out.println("5. Register a course for a lecturer");
        System.out.println("6. Display college information");
        System.out.println("7. Display the complete list of courses");
        System.out.println("8. Display the complete list of students");
        System.out.println("9. Display the complete list of lecturers");
        System.out.println("10. Display a list of courses currently taken by a particular student");
        System.out.println("11. Display a list of courses currently taught by a particular lecturer");
        System.out.println("12. Quit");
        System.out.print("Enter your choice: ");
    }

    private static void addCourse() {
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        college.addCourse(new Course(courseName,courseCode));
        System.out.println("Course added successfully.");
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
                
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        
        college.addStudent(new Student(studentName,studentID));
        System.out.println("Student added successfully.");
    }

    private static void addLecturer() {
        System.out.print("Enter lecturer name: ");
        String lecturerName = scanner.nextLine();
        
        System.out.print("Enter lecturer ID: ");
        String lecturerID = scanner.nextLine();
        
        college.addLecturer(new Lecturer( lecturerName,lecturerID));
        System.out.println("Lecturer added successfully.");
    }

    private static void registerCourseForStudent() {
        
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        
        college.registerCourseForStudent(studentID, courseCode);
    }

    private static void registerCourseForLecturer() {
        
        System.out.print("Enter lecturer ID: ");
        String lecturerID = scanner.nextLine();
        
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        
        college.registerCourseForLecturer(lecturerID, courseCode);
    }

    private static void displayCollegeInformation() {
        college.displayCollegeInformation();
    }

    private static void displayAllCourses() {
        college.displayAllCourses();
    }

    private static void displayAllStudents() {
        college.displayAllStudents();
    }

    private static void displayAllLecturers() {
        college.displayAllLecturers();
    }

    private static void displayCoursesForStudent() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        college.displayCoursesForStudent(studentID);
    }

    private static void displayCoursesForLecturer() {
        System.out.print("Enter lecturer ID: ");
        String lecturerID = scanner.nextLine();
        college.displayCoursesForLecturer(lecturerID);
    }
}
