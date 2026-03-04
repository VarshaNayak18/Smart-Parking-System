public class Main {

    public static void main(String[] args) {

        System.out.println("Smart Parking System Started");

        ParkingLot parkingLot = new ParkingLot(3);

        // Create vehicles
        Vehicle v1 = new Vehicle("KA01AB1234", "Car");
        Vehicle v2 = new Vehicle("KA05CD5678", "Car");
        Vehicle v3 = new Vehicle("KA09EF1111", "Bike");

        // Park vehicles
        parkingLot.parkVehicle(v1);
        parkingLot.parkVehicle(v2);
        parkingLot.parkVehicle(v3);

        System.out.println("\nParking Status:");
        parkingLot.displayStatus();

        // Remove vehicle from slot 2
        System.out.println("\nRemoving vehicle from slot 2...");
        parkingLot.removeVehicle(2);

        System.out.println("\nParking Status After Removal:");
        parkingLot.displayStatus();
    }
}
