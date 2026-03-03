public class Vehicle {

    private String vehicleNumber;
    private String vehicleType;
    private long entryTime;

    public Vehicle(String vehicleNumber, String vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.entryTime = System.currentTimeMillis();
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public long getEntryTime(){
        return entryTime;
    }

}
