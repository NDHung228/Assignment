//package Day11_7;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
//public class FileExercise {
//
//    static String fileStudent = "StudentsList.txt";
//    static List<String> listStudents = new LinkedList<>();
//    static String newFile;
//    static int count = 0;
//    static int stopPosition = 0;
//    static FileWriter myWriter ;
//
//    static void deleteFile() {
//        File myObj = new File(fileStudent);
//        if (myObj.delete()) {
//            System.out.println("Deleted the file: " + myObj.getName());
//        } else {
//            System.out.println("Failed to delete the file.");
//        }
//    }
//
//    static void writeNewFile() {
//        try {
//            boolean isDeleted = false;
//             myWriter = new FileWriter(newFile);
//
//            for (; count < listStudents.size() && count <= stopPosition; count++) {
//                if (!isDeleted) {
//                    isDeleted = true;
//                    System.out.println("Delete file Students");
//                    deleteFile();
//                }
//                myWriter.write(listStudents.get(count) + "\n");
//            }
//
//
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//
//    static void createNewFile() {
//        try {
//            File myObj = new File(newFile);
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//
//        static void readFile() {
//            try {
//
//                File myObj = new File(fileStudent);
//                Scanner myReader = new Scanner(myObj);
//
//                while (myReader.hasNextLine()) {
//                    String data = myReader.nextLine();
//
//                    if (data != null) {
//                        listStudents.add(data);
//                    }
//
//                }
//                myReader.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("An error occurred.");
//                e.printStackTrace();
//            }
//        }
//
//    static void writeAgain() {
//        try {
//            myWriter = new FileWriter(newFile,true);
//            myWriter.write("This is position write continue \n");
//            for (; count < listStudents.size(); count++) {
//                myWriter.write(listStudents.get(count)+"\n");
//            }
//
//
//            myWriter.close();
//            System.out.println("Successfully wrote to the file continue.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // create new file
//        System.out.println("Enter the file name: ");
//        newFile = sc.nextLine();
//
//        //read file
//        readFile();
//
//        System.out.println("Enter the number you want to stop: ");
//        stopPosition = sc.nextInt()-1;
//
//        // write file
//        writeNewFile();
//
//        // write file continue
//        writeAgain();
//
//    }
//}
