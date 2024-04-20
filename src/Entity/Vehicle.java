package Entity;

public class Vehicle {
    private String VehicleID;
    private VehicleType  VehicleType;
    private String VehicleBrand;
    private String VehicleModel;
    private String occupancy;
    private String VehicleColor;

    private Status status;

    public Vehicle() {
    }

    public Vehicle(String VehicleID, VehicleType VehicleType, String VehicleBrand, String VehicleModel, String occupancy, String VehicleColor, Status status) {
        this.VehicleID = VehicleID;
        this.VehicleType = VehicleType;
        this.VehicleBrand = VehicleBrand;
        this.VehicleModel = VehicleModel;
        this.occupancy = occupancy;
        this.VehicleColor = VehicleColor;
        this.status = status;
    }

    public String getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(String vehicleID) {
        VehicleID = vehicleID;
    }

    public Entity.VehicleType getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(Entity.VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public String getVehicleBrand() {
        return VehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        VehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        VehicleModel = vehicleModel;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public String getVehicleColor() {
        return VehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        VehicleColor = vehicleColor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}
