package vn.edu.likelion.model;

public class Course {
    private int stt;
    private int id;
    private String name;
    private int maxMember;
    private boolean status;


    public Course(int stt, int id, String name ,boolean status, int maxMember) {
        this.stt = stt;
        this.id = id;
        this.status = status;
        this.maxMember = maxMember;
        this.name = name;
    }

    public Course() {

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

    public int getNumberMember() {
        return maxMember;
    }

    public void setNumberMember(int numberMember) {
        this.maxMember = numberMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" +
                "stt=" + stt +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", maxMember=" + maxMember +
                ", status=" + status +
                '}';
    }
}
