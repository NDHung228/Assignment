package Day1_7.model;

public class CourseOnline extends Course{

    private String platform;
    private double time;

    public CourseOnline(int courseId, String courseName, String mentorName, int credit, String platform, double time) {
        super(courseId, courseName, mentorName, credit);
        this.platform = platform;
        this.time = time;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {

        return "Course Online " +
                ", platform='" + platform + '\'' +
                ", time=" + time +
                 super.toString() ;
    }
}
