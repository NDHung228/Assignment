package vn.edu.likeion.connectDB.impl;

import vn.edu.likeion.connectDB.dto.UserDTO;
import vn.edu.likeion.connectDB.global.Global;
import vn.edu.likeion.connectDB.service.ConnectService;
import vn.edu.likeion.connectDB.service.FileService;

import java.sql.*;
import java.util.Base64;
import java.util.List;

import static vn.edu.likeion.connectDB.ConnectDbApplication.sc;

public class ConnectImpl implements ConnectService {
    public static final String url = "jdbc:oracle:thin:@DongHung:1521:orcl";

    public static final String user = "system";
    public static final String password = "donghung";

    public static Connection conn;
    public static PreparedStatement stat;
    public FileService fileService;

    public ConnectImpl() {
        conn = null;
        stat = null;
        fileService = new FileImpl();
        getConnect();
    }

    public void getConnect() {
        try {
            // open connection
            conn = DriverManager.getConnection(url, user, password);

            String query = "select * from users";
            stat = conn.prepareStatement(query);
            stat.executeUpdate(); // Use executeUpdate() for DDL statements
            ResultSet rs = stat.executeQuery();

//            while (rs.next()) {
//                System.out.println(rs.getString(2));
//            }

            System.out.println("Connect data success");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void closeConnect() {
        try {
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void insertStudent() {
        List<String> listStudent = fileService.readFile();
        String insertSQL = "INSERT INTO students (id, name, status_attended) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password); PreparedStatement stat = conn.prepareStatement(insertSQL)) {

            for (String student : listStudent) {
                String[] parts = student.split("\t");
                int idStudent = Integer.parseInt(parts[0]);
                String name = parts[1];
                int statusAttended = Integer.parseInt(parts[2]);

                stat.setInt(1, idStudent);
                stat.setString(2, name);
                stat.setInt(3, statusAttended);

                stat.executeUpdate();
            }

            System.out.println("Students inserted successfully");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void login() {
        String loginSQL = "select username,user_id,role_id,ROLENAME from users u,ROLE r where u.username = ? and u.password = ? " +
                "AND r.RoleID = u.role_id";

        try {
            System.out.print("username: " );
            String username = sc.next();

            System.out.print("password: " );
            String passwordUser = sc.next();


            stat = conn.prepareStatement(loginSQL);

            stat.setString(1, username);
            stat.setString(2, base64Encode(passwordUser));

            ResultSet rs = stat.executeQuery();

            rs.next();

            UserDTO userDTO = new UserDTO(rs.getString(1),rs.getInt(2),rs.getString(3));

            Global.roleID = Integer.parseInt(rs.getString(3));
            Global.roleName = rs.getString(4);

            System.out.println("Login success "+Global.roleName );

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void register(String username, String password, int role) {
        String insertSQL = "INSERT INTO users (username, password, role_id) VALUES (?, ?, ?)";

        try {
            stat = conn.prepareStatement(insertSQL);
            stat.setString(1, username);
            stat.setString(2, base64Encode(password));
            stat.setInt(3, role);
            stat.executeUpdate(); // Use executeUpdate() for DDL statements
            System.out.println("Register success");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    private String base64Encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

}
