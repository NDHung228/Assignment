package vn.edu.likelion.impl;

import vn.edu.likelion.model.Course;
import vn.edu.likelion.model.Student;
import vn.edu.likelion.services.StudentService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static vn.edu.likelion.Main.globalID;
import static vn.edu.likelion.Main.sc;
import static vn.edu.likelion.impl.CourseImpl.courseList;

public class StudentImpl implements StudentService {
    public static List<Student> listStudent = new ArrayList<>();;
    CourseImpl courseImpl = new CourseImpl();;

    @Override
    public void addStudent() {
        System.out.println("This is function ADD STUDENT");

        Student std = new Student();
        System.out.println("Enter student: ");

        // set id and stt
        globalID++;
        std.setStt(globalID);
        std.setId(globalID);

        System.out.print("Enter name of student: ");
        std.setName(sc.next());

        System.out.print("Enter age of student: ");
        std.setAge(Integer.parseInt(sc.next()));

        courseImpl.getAllCourses(); // print all course for user choose

        String nameCourse = chooseCourse();

        std.setNameCourse(nameCourse);
        std.setTimeJoin(new Date());

        listStudent.add(std);
        courseImpl.updateStatusCourse();
        System.out.println("Student added successfully: " + std.toString());
    }

    @Override
    public void updateStudent() {
        System.out.println("This is function UPDATE STUDENT");

        Student std = findStudentByUser();

        System.out.println("This is student init: " + std.toString());

        int chose = chooseAttributeUpdating();
        if (chose == 4) {
            updateNameStudent(std);
            updateAgeStudent(std);
            updateNameCourse(std);

        } else if (chose == 1) {
            updateNameStudent(std);
        } else if (chose == 2) {
            updateAgeStudent(std);
        } else if (chose == 3) {
            updateNameCourse(std);
        }

        System.out.println("This is student updated: " + std.toString());
    }

    @Override
    public void deleteStudent() {

        System.out.println("This is function DELETE STUDENT");
        Student std = findStudentByUser();

        listStudent.remove(std);
        courseImpl.updateStatusCourse();

        System.out.println("Student successfully deleted");
    }

    @Override
    public void printGetAllStudent() {
        System.out.println("This is function PRINT ALL STUDENT");
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void printStudentsAndCourses() {
        printGetAllStudent();
        courseImpl.getAllCourses();
    }

    private Student findStudentByUser() {
        System.out.print("Enter id of student: ");
        int id = Integer.parseInt(sc.next());
        Student std = getStudent(id);
        while (std == null) {
            System.out.print("Please enter id of student again: ");
            id = Integer.parseInt(sc.next());
            std = getStudent(id);
        }

        return std;
    }

    private Student getStudent(int id) {
        for (Student student : listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private String findNameCourse(int id) {
        for (Course course : courseList) {
            if (course.getId() == id) {
                return course.getName();
            }
        }
        return null;
    }

    private String chooseCourse() {
        System.out.print("Please choose id of course for student: ");
        int idCourse = sc.nextInt();
        String nameCourse = findNameCourse(idCourse);

        while (nameCourse == null) {
            System.out.print("Please choose correct course & Enter id of course again: ");
            idCourse = sc.nextInt();
            nameCourse = findNameCourse(idCourse);
        }

        // check course full student yet
        boolean checkedAdd = checkStudentInCourse(nameCourse);
        while (checkedAdd) {
            System.out.print("Course is full student & Choose other course ");
            nameCourse = chooseCourse();
            checkedAdd = checkStudentInCourse(nameCourse);
        }
        return nameCourse;
    }

    private boolean checkStudentInCourse(String name) {
        Course course = courseImpl.getCourseByName(name);

        int count = 1;
        for (Student student : listStudent) {
            if (student.getNameCourse().equals(name)) {
                count++;
            }
        }

        // course is full student
        return count > course.getNumberMember();
    }

    private int chooseAttributeUpdating() {
        System.out.println("Choose attribute updating: ");
        System.out.println("1. Update name of student");
        System.out.println("2. Update name of age");
        System.out.println("3. Update name of course of student");
        System.out.println("4. Update all");

        System.out.print("Please choose a attribute you would like to update: ");
        return Integer.parseInt(sc.next());
    }

    private void updateNameStudent(Student std) {
        System.out.print("Enter update name of student: ");
        String newName = sc.next();
        std.setName(newName);
    }

    private void updateAgeStudent(Student std) {
        System.out.print("Enter update age of student: ");
        int age = Integer.parseInt(sc.next());
        std.setAge(age);
    }

    private void updateNameCourse(Student std) {
        courseImpl.getAllCourses(); // print all course for user choose
        String nameCourse = chooseCourse();
        std.setNameCourse(nameCourse);
        courseImpl.updateStatusCourse();
    }

}
