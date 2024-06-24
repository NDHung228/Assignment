package vn.edu.likelion.model;

import java.util.Date;

public class Student {
    private int stt;
    private int id;
    private int age;
    private Date timeJoin;
    private String name;
    private String nameCourse;

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "stt=" + stt +
                ", id=" + id +
                ", age=" + age +
                ", timeJoin=" + timeJoin +
                ", name='" + name + '\'' +
                ", nameCourse='" + nameCourse + '\'' +
                '}';
    }

    public Student(int stt, int id, String name, int age, Date timeJoin) {
        this.stt = stt;
        this.name = name;
        this.timeJoin = timeJoin;
        this.age = age;
        this.id = id;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStt() {
        return stt;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getTimeJoin() {
        return timeJoin;
    }

    public void setTimeJoin(Date timeJoin) {
        this.timeJoin = timeJoin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
