package Vehicles;

import Entity.Status;
import Entity.Vehicle;
import Entity.VehicleStatus;
import Entity.VehicleType;

public class Bike extends Vehicle {
    public Bike(String VehicleID, VehicleType VehicleType, String VehicleBrand, String VehicleModel, String occupancy, String VehicleColor, int dailyRentalCost, int hourlyRentalCost, VehicleStatus status) {
        super(VehicleID, VehicleType, VehicleBrand, VehicleModel, occupancy, VehicleColor, dailyRentalCost, hourlyRentalCost, status);
    }
}
