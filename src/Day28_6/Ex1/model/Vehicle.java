package Day28_6.Ex1.model;

public abstract class Vehicle {
    public String name;
    public final int id;
    public static int vehicleCount = 0;

    protected Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
        vehicleCount++;
    }

    public abstract void move();
}
