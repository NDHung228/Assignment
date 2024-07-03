package extra_assignment.model;

import java.util.ArrayList;
import java.util.List;

public class ClassStudent {
    private final int id;
    private String name;
    private int maxStudent;
    private List<Student> students;
    private static int idCounter = 1;

    public ClassStudent( String name, int maxStudent) {
        id = idCounter++;
        this.name = name;
        this.maxStudent = maxStudent;
        this.students = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxStudent=" + maxStudent +
                ", students=" + students +
                '}';
    }
}
