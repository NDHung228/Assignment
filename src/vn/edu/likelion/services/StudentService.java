package vn.edu.likelion.services;

import vn.edu.likelion.model.Student;

public interface StudentService {

    public void addStudent();
    public void updateStudent();
    public void deleteStudent();
    public void printGetAllStudent();
    public void printStudentsAndCourses() ;

    default int demo() {
        System.out.println("This is method default");
        return 0;
    }
}
