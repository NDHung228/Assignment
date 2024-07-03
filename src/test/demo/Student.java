package test.demo;

public class Student extends Room{

    private int name;

    public Student() {
        System.out.println("This is a student");
        System.out.println("Demo1");
    }

    public Student(int id_room) {
        super(id_room);
    }

    public Student(int idRoom, int name) {
        super(idRoom);
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public void printText() {
        super.printText();
        System.out.println("This is method final printText in Student");
    }

}
