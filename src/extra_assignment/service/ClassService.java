package extra_assignment.service;

import extra_assignment.model.ClassStudent;
import extra_assignment.model.Student;
import extra_assignment.model.Teacher;

public interface ClassService  {
    // class
    void addClass(ClassStudent c);
    void deleteClass(ClassStudent c);


    // student
    void dropStudentInClass(int idStudent,int idClass,String reason);
    void addStudent(Student s,int idClass);
    void editStudent(int idStudent,Student studentUpdate);

    // teacher
    void printStudentsOfTeacher(int idTeacher);
    void addTeacherToClass(Teacher t,int idClass);

    // print
    void printAllTeacherInSchool();


}
