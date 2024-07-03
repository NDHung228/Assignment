package Day28_6.Ex1.model;

public class Bike extends Vehicle{
    private boolean hasGear;

    protected Bike(int id, String name,boolean hasGear) {
        super(id, name);
        this.hasGear = hasGear;
    }

    public boolean isHasGear() {
        return hasGear;
    }

    public void setHasGear(boolean hasGear) {
        this.hasGear = hasGear;
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
