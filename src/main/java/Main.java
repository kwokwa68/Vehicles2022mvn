import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ArrayList<Vehicle> allVehicles = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("In Vehicles Main");

        Vehicle myVehicle = new Vehicle();
        myVehicle.setMilesPerGallon(20);
        myVehicle.setGallonsOfGas(10.0);
        myVehicle.setOdometer(0);
        allVehicles.add(myVehicle);

        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setMilesPerGallon(25);
        yourVehicle.setGallonsOfGas(8.0);
        yourVehicle.setOdometer(10000);
        allVehicles.add(yourVehicle);

        Vehicle ourVehicle = new Vehicle();
        ourVehicle.setMilesPerGallon(15);
        ourVehicle.setGallonsOfGas(12.0);
        ourVehicle.setOdometer(20000);
        allVehicles.add(ourVehicle);

        drive(100);
        drive(60);
    }

    private static void drive(int milesDriven) {
        for (Vehicle vehicle: allVehicles){
            System.out.println("Odometer "+vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonsOfGas());
            vehicle.go(milesDriven);
            System.out.println("Odometer "+vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonsOfGas());
        }
    }
}