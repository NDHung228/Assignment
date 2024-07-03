package Day28_6.Ex1.model;

import java.util.ArrayList;
import java.util.List;

public class VehicleDemo {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        int id = 1;

        // Init object
        Vehicle car1 = new Car(id++," Mercedes-Benz ",4);
        Vehicle bike1 = new Bike(id++,"Ruby ",false);

        // add vehicle(car or bike) to array
        vehicles.add(car1);
        vehicles.add(bike1);

        // access method move of each vehicle
        for (Vehicle v : vehicles) {
            v.move();
        }

        System.out.println("Total number of vehicle: "+Vehicle.vehicleCount);

    }
}
