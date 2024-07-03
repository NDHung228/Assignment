package extra_assignment.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teacher extends Person{
    private int idTeacher;
    private List<ClassStudent> classStudents;

    public Teacher(int idTeacher,String name, LocalDate birthDay, String cccd) {
        super(name, birthDay, cccd);
        classStudents = new ArrayList<>();
        this.idTeacher =  idTeacher;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher() {

    }

    public List<ClassStudent> getClassStudents() {
        return classStudents;
    }

    public void setClassStudents(List<ClassStudent> classStudents) {
        this.classStudents = classStudents;
    }


    public void addClassStudent(ClassStudent classStudent) {
        if(this.classStudents == null){
            this.classStudents = new ArrayList<ClassStudent>();
        }
        classStudents.add(classStudent);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                ", classStudents=" + classStudents +
                '}';
    }
}
