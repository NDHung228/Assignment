package Day28_6.Ex1.model;

public class Car extends Vehicle{
    private int numberOfDoors;

    protected Car(int id, String name, int numberOfDoors) {
        super(id, name);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
