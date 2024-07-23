package vn.edu.likeion.connectDB.impl;

import vn.edu.likeion.connectDB.service.TeacherService;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static vn.edu.likeion.connectDB.ConnectDbApplication.sc;
import static vn.edu.likeion.connectDB.impl.ConnectImpl.*;

public class TeacherImpl implements TeacherService {
    @Override
    public void listStudentAttended() {
        try {

            String query = "select * from students where STATUS_ATTENDED  = 0";

            stat = conn.prepareStatement(query);
            stat.executeUpdate(); // Use executeUpdate() for DDL statements
            ResultSet rs = stat.executeQuery();

            System.out.println("This is list student attended");
            while (rs.next()) {
                System.out.print(rs.getString(2));
                String status = rs.getInt(3) == 0 ? "Absent" : "Present";
                System.out.println("\t" + status);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void listStudentAbsent() {
        try {

            String query = "select * from students where STATUS_ATTENDED  = 1";

            stat = conn.prepareStatement(query);
            stat.executeUpdate(); // Use executeUpdate() for DDL statements
            ResultSet rs = stat.executeQuery();

            System.out.println("This is list student absent");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t");

                System.out.print(rs.getString(2));
                String status = rs.getInt(3) == 0 ? "Absent" : "Present";
                System.out.println("\t" + status);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void allStudent()  {
        try {
            String query = "select * from students";

            stat = conn.prepareStatement(query);
            stat.executeUpdate(); // Use executeUpdate() for DDL statements
            ResultSet rs = stat.executeQuery();

            System.out.println("This is list student");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2));
                String status = rs.getInt(3) == 0 ? "Absent" : "Present";
                System.out.println("\t" + status);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void updateStatusStudent() {
        try {
            System.out.println("Enter id of student to update");
            String studentId = (sc.next());

            String query = "UPDATE STUDENTS s SET s.STATUS_ATTENDED = CASE WHEN s.STATUS_ATTENDED = 1 THEN 0 ELSE 1 END WHERE s.ID = ?";
            stat = conn.prepareStatement(query);
            stat.setString(1, studentId);
            stat.executeUpdate(); // Use executeUpdate() for DDL statements
            ResultSet rs = stat.executeQuery();

            System.out.println("Set status of student success");

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
