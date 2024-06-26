package Day26_6.Ex2;

import Day26_6.Ex2.model.Employee;
import Day26_6.Ex2.model.Manager;
import Day26_6.Ex2.model.Programmer;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Corona Cadogan",6000,1000);
        manager.displayInfo();

        System.out.println("---------------");

        Employee programmer = new Programmer("Programmer",5000,20,25);
        programmer.displayInfo();
    }
}
