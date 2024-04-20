package Entity;

import java.util.List;

public class VehicleInventoryManagement {

    List<Vehicle> vehicles;

    public VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        return vehicles.remove(vehicle);
    }

    public Vehicle searchVehicle(String vehicleID) {
        for(Vehicle vehicle: vehicles) {
            if(vehicle.getVehicleID().equals(vehicleID)) {
                return vehicle;
            }
        }
        return null;
    }

}
