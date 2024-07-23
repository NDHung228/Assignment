package vn.edu.likeion.connectDB.service;

import java.sql.SQLException;
import java.util.List;

public interface ConnectService {
    void getConnect();
    void closeConnect();
    void insertStudent();
    void login();
    void register(String username, String password,int role);
}