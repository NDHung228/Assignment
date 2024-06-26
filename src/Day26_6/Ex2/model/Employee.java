package Day26_6.Ex2.model;

public abstract class Employee {
    public String name;
    public double salary;

//    public Employee(final String name, final double salary) {
//        this.name = name;
//        this.salary = salary;
//    }



    public abstract void totalSalary();
    public abstract void displayInfo();
}
