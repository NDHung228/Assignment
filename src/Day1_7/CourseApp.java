package Day1_7;

import Day1_7.model.Course;
import Day1_7.model.CourseOnline;
import Day1_7.model.Student;

import java.util.ArrayList;
import java.util.List;

public class CourseApp {
    public static List<Student> listStudent;

    public static void main(String[] args) {
        listStudent = new ArrayList<Student>();
        List<Course> listCourse = new ArrayList<Course>();

        int studentId = 0;
        int courseId = 0;

        Course course1 = new Course(courseId++,"Java Offline","Ánh Dương",100);
        Course course2 = new CourseOnline(courseId++,"Java Online","Ánh Dương",100,"Zoom",50);

        listCourse.add(course1);
        listCourse.add(course2);

        Student student1 = new Student(studentId++,"Nguyen Van 0",0);
        Student student2 = new Student(studentId++,"Nguyen Van 1",1);
        Student student3 = new Student(studentId++,"Nguyen Van 2",1);


        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);


        for (Course c : listCourse) {
            c.displayDetailCourse();
            c.displayStudent();

            System.out.println();
        }
    }


}
