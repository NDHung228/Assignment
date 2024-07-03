package extra_assignment;

import extra_assignment.impl.ClassImpl;
import extra_assignment.model.ClassStudent;
import extra_assignment.model.Student;
import extra_assignment.model.Teacher;
import extra_assignment.service.ClassService;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        ClassService classService = new ClassImpl();

        // create class
        ClassStudent c1 = new ClassStudent("Class 1 ", 1);
        ClassStudent c2 = new ClassStudent("Class 2 ", 2);
        ClassStudent c3 = new ClassStudent("Class 3 ", 3);


        // create teacher
        int countTeacher = 1;
        Teacher t1 = new Teacher(countTeacher++,"Teacher 1", LocalDate.parse("2000-07-05"),String.valueOf(1));
        Teacher t2 = new Teacher(countTeacher++,"Teacher 2", LocalDate.parse("2000-07-05"),String.valueOf(2));
        Teacher t3 = new Teacher(countTeacher++,"Teacher 3", LocalDate.parse("2000-07-05"),String.valueOf(3));

        // create student
        int countStudent = 1;
        Student student1 = new Student(countStudent++,"Student 1", LocalDate.parse("2004-07-05"),String.valueOf(1));
        Student student2 = new Student(countStudent++,"Student 2", LocalDate.parse("2015-07-05"),String.valueOf(2));
        Student student3 = new Student(countStudent++,"Student 3", LocalDate.parse("2004-07-05"),String.valueOf(1));
        Student student4 = new Student(countStudent++,"Student 4", LocalDate.parse("2004-07-05"),String.valueOf(1));
        Student student5 = new Student(countStudent++,"Student 5", LocalDate.parse("2004-07-05"),String.valueOf(1));


        // add class to school
        // happy case
        classService.addClass(c1);
        classService.addClass(c2);
        classService.addClass(c3);
        System.out.println();


        // unhappy case
        classService.addClass(c3); // enough classes have been added in the school
        classService.deleteClass(c3); // delete class
        ClassStudent c4 = new ClassStudent("Class 4 ", 11); //  more maximum student of class in school
        classService.addClass(c4);
        System.out.println();


        // add teacher in class
        classService.addTeacherToClass(t1,c1.getId());
        classService.addTeacherToClass(t1,c1.getId()); // error when in class have been t1
        classService.addTeacherToClass(t2,c1.getId());
        classService.addTeacherToClass(t1,c2.getId());
        classService.addTeacherToClass(t2,c2.getId());


        // add student in class
        classService.addStudent(student1,c1.getId());
        classService.addStudent(student2,c1.getId()); // error don't enough age
        classService.addStudent(student3,c1.getId()); // error enough max student




    }
}
