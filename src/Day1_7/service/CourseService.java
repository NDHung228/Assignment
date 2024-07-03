package Day1_7.service;

public interface CourseService {




    default void displayDetailCourse() {
        System.out.println("This is detail of course");
    }

}
