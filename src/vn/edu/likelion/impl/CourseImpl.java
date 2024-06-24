package vn.edu.likelion.impl;

import vn.edu.likelion.model.Course;
import vn.edu.likelion.model.Student;
import vn.edu.likelion.services.CourseService;

import java.util.ArrayList;
import java.util.List;

import static vn.edu.likelion.Main.globalID;
import static vn.edu.likelion.Main.sc;
import static vn.edu.likelion.impl.StudentImpl.listStudent;

public class CourseImpl implements CourseService {

    public static List<Course> courseList = new ArrayList<Course>();


    @Override
    public void addCourse() {
        System.out.println("This is function ADD COURSE");

        // max 5 course
        if(courseList.size() >= 5){
            System.err.println("Can't organize more 5 course ");
            return ;
        }

        int maxStudent;
        Course course = new Course();

        // set data default;
        globalID++;
        course.setStt(globalID);
        course.setId(globalID);
        course.setStatus(false);

        // set data from user
        System.out.print("Enter course name: ");
        String nameCourse = sc.next();

        // check name of course don't duplicate
        while (checkDuplicateName(nameCourse)) {
            System.out.print("Course name already exist & Enter course name again:");
            nameCourse = sc.next();
        }
        course.setName(nameCourse);

        System.out.print("Enter max number student of course: ");
        maxStudent = Integer.parseInt(sc.next());
        while (maxStudent <= 0 || maxStudent > 3) {
            if (maxStudent <= 0) {
                System.out.print("Please enter a valid number & Enter quantity of student again: ");
            }
            if (maxStudent > 3) {
                System.out.print("Max student of course is 3 & Enter quantity of student again: ");
            }
            maxStudent = Integer.parseInt(sc.next());
        }
        course.setNumberMember(maxStudent);
        courseList.add(course);

        System.out.println("Add course successfully " +course.toString());
    }

    @Override
    public void getCourse() {
        System.out.println("This is function WATCH COURSE");

        System.out.print("Enter id of course: ");
        int id = Integer.parseInt(sc.next());
        for (Course course : courseList) {
            if(course.getId() == id){
                System.out.println(course.toString());
                return;
            }
        }

        System.out.println("Course not found");
    }

    @Override
    public void getAllCourses() {
        System.out.println("This is all course ");
        for (Course c : courseList) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void deleteCourse() {
        System.out.println("This is function DELETE COURSE");

        System.out.print("Enter id of course: ");
        int id = Integer.parseInt(sc.next());
        Course course = getCourseById(id);
        while (course == null) {
            System.out.print("Please enter id of course again: ");
            id = Integer.parseInt(sc.next());
            course = getCourseById(id);
        }
        courseList.remove(course);

        System.out.println("Course successfully deleted");
    }

    @Override
    public void updateCourse() {
        System.out.println("This is function UPDATE COURSE");

        System.out.print("Enter id of course: ");
        int id = Integer.parseInt(sc.next());
        Course course = getCourseById(id);
        while (course == null) {
            System.out.print("Please enter id of course again: ");
            id = Integer.parseInt(sc.next());
            course = getCourseById(id);
        }

        int chose = chooseAttributeUpdating();
        System.out.println("This is course init: " + course.toString());

        if(chose == 1){
            updateNameCourse(course);

        } else if(chose == 2){
            updateMaxMember(course);

        } else if(chose == 3){

            updateNameCourse(course);
            updateMaxMember(course);

        }
        System.out.println("This is course updated: " + course.toString());

    }

    private void updateNameCourse(Course course){
        System.out.print("Enter update name of course: ");
        String newName = sc.next();
        course.setName(newName);
    }

    private void updateMaxMember(Course course){
        System.out.print("Enter update max member of course: ");
        int newMaxMember = Integer.parseInt(sc.next());
        course.setNumberMember(newMaxMember);
    }

    public Course getCourseByName(String name) {
        for (Course course : courseList) {
            if(course.getName().equals(name)){
                return course;
            }
        }
        return null;
    }

    public void updateStatusCourse() {
        int count ;
        for(Course course : courseList){
            count = 0;
           for(Student std: listStudent) {
               if(std.getNameCourse().equals(course.getName())) count++;
           }

           if(count == 0){
                course.setStatus(false);
           }
           else if(count == course.getNumberMember()){
               course.setStatus(true);
           }
        }
    }

    private int chooseAttributeUpdating() {
        System.out.println("Choose attribute updating: ");
        System.out.println("1. Update name of course");
        System.out.println("2. Update max member of course");
        System.out.println("3. Update all");

        System.out.print("Please choose a attribute you would like to update: ");
        return Integer.parseInt(sc.next());
    }

    private boolean addStudentToCourse(String nameCourse) {
        return true;
    }

    private boolean checkDuplicateName(String nameCourse) {
        for (Course course : courseList) {
            if (course.getName().equals(nameCourse)) {
                return true;
            }
        }
        return false;
    }

    private Course getCourseById(int id) {
        for (Course course : courseList) {
            if(course.getId() == id){
                return course;
            }
        }
        return null;
    }
}
