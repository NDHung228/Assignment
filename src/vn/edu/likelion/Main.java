package vn.edu.likelion;

import vn.edu.likelion.impl.CourseImpl;
import vn.edu.likelion.impl.StudentImpl;
import vn.edu.likelion.services.CourseService;
import vn.edu.likelion.services.StudentService;

import java.util.*;


public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static int globalID = 0;

    public static void introduceProgramme() {
        System.out.println();
        System.out.println("Introduce function: ");

        System.out.println("This is Course: ");
        System.out.println("1. Watch detail course");
        System.out.println("2. Add course");
        System.out.println("3. Update course");
        System.out.println("4. Delete course");

        System.out.println("***********");
        System.out.println("This is Student: ");
        System.out.println("5. Add Student");
        System.out.println("6. Update Student");
        System.out.println("7. Delete Student");

        System.out.println("***********");
        System.out.println("8. Exit");
        System.out.println("9. Get all students");
        System.out.println("10. Get all courses");
        System.out.println("11. Get all students && get all courses");
    }


    public static void main(String[] args) {

        CourseService courseService = new CourseImpl();
        StudentService studentService = new StudentImpl();

        courseService.demo();
        CourseService.demoStatic();

//        boolean stopProgram = false;
//        int choice = 0;
//
//        while (!stopProgram) {
//
//            introduceProgramme();
//
//            try {
//                System.out.print("Please choose a method you would like to run: ");
//                choice = Integer.parseInt(sc.next());
//                if (choice == 1) {
//                    courseService.getCourse();
//                } else if (choice == 2) {
//                    courseService.addCourse();
//                } else if (choice == 3) {
//                    courseService.updateCourse();
//                } else if (choice == 4) {
//                    courseService.deleteCourse();
//                } else if (choice == 5) {
//                    studentService.addStudent();
//                } else if (choice == 6) {
//                    studentService.updateStudent();
//                } else if (choice == 7) {
//                    studentService.deleteStudent();
//                } else if (choice == 8) {
//                    stopProgram = true;
//                } else if(choice == 9) {
//                    studentService.printGetAllStudent();
//                } else if(choice == 10) {
//                    courseService.getAllCourses();
//                }
//                else if(choice == 11) {
//                    studentService.printStudentsAndCourses();
//                }
//                else {
//                    System.err.println("Please choose a valid option!");
//                }
//            } catch (Exception e) {
//                System.err.println("Please choose a valid option!");
//            }
//        }

    }
}