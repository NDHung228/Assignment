package extra_assignment.model;

import extra_assignment.enumeration.StatusStudent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Student extends Person {

    private int id;
    private StatusStudent statusStudent;
    private LocalDate dateOfOpening;

    public int getId() {
        return id;
    }

    public Student(int id,String name, LocalDate birthDay, String cccd) {
        super(name, birthDay, cccd);
        this.id = id;
        this.statusStudent = StatusStudent.Waiting;
    }

    public LocalDate getDateOfOpening() {
        return dateOfOpening;
    }

    public void setDateOfOpening(LocalDate dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
    }


    public StatusStudent getStatusStudent() {
        return statusStudent;
    }

    public void setStatusStudent(StatusStudent statusStudent) {
        this.statusStudent = statusStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", statusStudent=" + statusStudent +
                ", dateOfOpening=" + dateOfOpening +
                '}';
    }
}
