package vn.edu.likelion.impl;

import vn.edu.likelion.services.CourseService;
import vn.edu.likelion.services.StudentService;

public class Test implements CourseService, StudentService {
    @Override
    public void addCourse() {

    }

    @Override
    public void getCourse() {

    }

    @Override
    public void getAllCourses() {

    }

    @Override
    public void deleteCourse() {

    }

    @Override
    public void updateCourse() {

    }

    @Override
    public int demo() {
       return  CourseService.super.demo();
    }

    @Override
    public void addStudent() {

    }

    @Override
    public void updateStudent() {

    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void printGetAllStudent() {

    }

    @Override
    public void printStudentsAndCourses() {

    }
}
