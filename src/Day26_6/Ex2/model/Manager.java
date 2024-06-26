package Day26_6.Ex2.model;

public class Manager extends Employee{
    public double bonus;

    public Manager(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public void totalSalary() {
        System.out.println("Total salary: "+(salary+bonus));
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Name: "+name);
        System.out.println("Base Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        totalSalary();
    }
}
