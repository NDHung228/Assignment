package vn.edu.likeion.connectDB.impl;

import vn.edu.likeion.connectDB.service.FileService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileImpl implements FileService {
    @Override
    public List<String> readFile() {
        String fileStudent = "StudentsList.txt";
        List<String> listStudents = new LinkedList<>();
        try {
            File myObj = new File(fileStudent);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data != null) {
                    listStudents.add(data);
                }
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return listStudents;
    }
}
