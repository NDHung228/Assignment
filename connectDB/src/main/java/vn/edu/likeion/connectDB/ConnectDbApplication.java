package vn.edu.likeion.connectDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.likeion.connectDB.global.Global;
import vn.edu.likeion.connectDB.impl.ConnectImpl;
import vn.edu.likeion.connectDB.impl.TeacherImpl;
import vn.edu.likeion.connectDB.service.ConnectService;
import vn.edu.likeion.connectDB.service.TeacherService;

import java.sql.*;
import java.util.Scanner;

@SpringBootApplication
public class ConnectDbApplication {

	public static Scanner sc = new Scanner(System.in);

	public static void introduceProgramme() {
		System.out.println();
		System.out.println("Introduce Programme: ");

		System.out.println("0. Exit Programme");

		if( Global.roleID == 0) {
			System.out.println("4. Login");
		}

	}

    public static void main(String[] args) {
        ConnectService connectService = new ConnectImpl();
//		connectService.insertStudent();
//		String username = "teacherB";
//		String password = "teacherB";

//		connectService.register(username, password,3);
//		connectService.login("teacherAssistantY", "teacherAssistantY");

		menu();
        connectService.closeConnect();
    }

    static void menu() {

        boolean isRunning = true;
        int choice;

		ConnectService connectService = new ConnectImpl();

        while (isRunning) {
			System.out.println("test "+Global.roleName);
			introduceProgramme();
            System.out.print("Please choose a method you would like to run: ");
            choice = Integer.parseInt(sc.next());

			 if( choice == 4 ) {
				connectService.login();
				if(!Global.roleName.isEmpty()) {
					isRunning = false;
				}
			}
			else if(choice == 0) {
				isRunning = false;
			} else {
				System.out.println("Invalid choice");
			}
        }

		if(Global.roleName.equals("A") || Global.roleName.equals("B")) {
			serviceTeacher();
		} else {
			serviceTeacherAssistant();
		}

    }

	static void menuTeacher() {
		System.out.println("0. Exit Programme");
		System.out.println("1. All student");
		System.out.println("2. Student absent");
		System.out.println("3. Student attended");

		if( Global.roleName.equals("A")) {
			System.out.println("4. Teacher check attended");

		}
	}

	static void menuAssistant() {
		if( Global.roleName.equals("X")) {
			System.out.println("4. Teacher Assistant check attended");

		} else {
			System.out.println("1. All student");
			System.out.println("2. Student absent");
			System.out.println("3. Student attended");
		}
		System.out.println("0. Exit Programme");

	}

	static void serviceTeacher() {
		TeacherService teacherService = new TeacherImpl();
		int choice;
		System.out.print("Please choose a method you would like to run: ");
		boolean isRunning = true;

		while (isRunning) {
			menuTeacher();
			System.out.print("Please choose a method you would like to run: ");
			choice = Integer.parseInt(sc.next());

			if(choice == 1) {
				teacherService.allStudent();
			} else if(choice == 2) {
				teacherService.listStudentAbsent();
			} else if(choice == 3) {
				teacherService.listStudentAttended();
			}
			else if( Global.roleName.equals("A") && choice == 4) {
				System.out.println("4. Teacher check attended");
				teacherService.updateStatusStudent();
			}
			else if(choice == 0) {
				isRunning = false;
			}
			else {
				System.out.println("Invalid choice");
			}
		}
	}

	static void serviceTeacherAssistant() {
		TeacherService teacherService = new TeacherImpl();
		int choice;
		System.out.print("Please choose a method you would like to run: ");
		boolean isRunning = true;

		while (isRunning) {
			menuAssistant();
			System.out.print("Please choose a method you would like to run: ");
			choice = Integer.parseInt(sc.next());

			if(Global.roleName.equals("Y")) {
				if(choice == 1) {
					teacherService.allStudent();
				} else if(choice == 2) {
					teacherService.listStudentAbsent();
				} else if(choice == 3) {
					teacherService.listStudentAttended();
				}
			} else {
				System.out.println("4. Teacher check attended");
				teacherService.updateStatusStudent();
			}

			if(choice == 0) {
				isRunning = false;
			}
			else {
				System.out.println("Invalid choice");
			}
		}
	}

}
