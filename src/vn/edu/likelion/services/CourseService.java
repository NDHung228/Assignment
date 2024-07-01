package vn.edu.likelion.services;

import vn.edu.likelion.model.Course;

import java.util.List;

public interface CourseService {

    public void addCourse();
    public void getCourse();
    public void getAllCourses();
    public void deleteCourse();
    public void updateCourse();

    default int demo() {
        System.out.println("This is method default");
        return 1;
    }

    static void demoStatic() {
        System.out.println("This is method static");
    }

}
