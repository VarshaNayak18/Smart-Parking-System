public class Main {
    public static void main(String[] args) {
        System.out.println("Smart Parking System");
        
        // Creating a vehicle object
        Vehicle v1 = new Vehicle("KA01AB1234", "Car");
        
        System.out.println("Vehicle Number: " + v1.getVehicleNumber());
        System.out.println("Vehicle Type: " + v1.getVehicleType());
        System.out.println("Entry Time: " + v1.getEntryTime());
    }
}
