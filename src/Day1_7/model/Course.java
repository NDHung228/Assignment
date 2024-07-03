package Day1_7.model;

import Day1_7.service.CourseService;

import java.util.List;

import static Day1_7.CourseApp.listStudent;

public class Course implements CourseService {
    private int courseId;
    private String courseName;
    private String mentorName;
    private int credit;

    public Course(int courseId, String courseName, String mentorName, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.mentorName = mentorName;
        this.credit = credit;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public void displayDetailCourse() {
        CourseService.super.displayDetailCourse();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", mentorName='" + mentorName + '\'' +
                ", credit=" + credit +
                '}';
    }

    public void displayStudent() {
        List<Student> studentInCourse = listStudent.stream().
                filter(student -> student.getCourseId() == courseId).toList();


        System.out.println("This is all student of course: "+courseName);
        studentInCourse.forEach(System.out::println);
    }
}
