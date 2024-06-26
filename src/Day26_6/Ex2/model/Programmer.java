package Day26_6.Ex2.model;

public class Programmer extends Employee{
    public int hourOverTime;
    public double rateHourly;
    public Programmer(String name, double salary, int hourOverTime,double rateHourly) {
        this.name = name;
        this.salary = salary;
        this.rateHourly = rateHourly;
        this.hourOverTime = hourOverTime;
    }

    @Override
    public void totalSalary() {
        System.out.println("Total salary: "+(salary+(hourOverTime*rateHourly)));
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Name: "+name);
        System.out.println("Base Salary: "+salary);
        System.out.println("Overtime Hours: "+hourOverTime);
        System.out.println("Rate Hourly: "+rateHourly);
        totalSalary();
    }
}
