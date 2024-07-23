package vn.edu.likeion.connectDB.service;

import java.sql.SQLException;

public interface TeacherService {

    void listStudentAttended() ;
    void listStudentAbsent();
    void allStudent() ;

    void updateStatusStudent() ;
}
