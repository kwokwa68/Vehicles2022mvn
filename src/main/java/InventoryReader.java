import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InventoryReader {
    static List<Vehicle> allVehicles = new ArrayList<>();

    public static void main(String[] args){
        createVehicle();
        runVehicle();
    }
    private static void createVehicle() {
        Path inventoryFilePath = Paths.get("inventory.txt");
        try {
            List<String> inventoryLines = Files.readAllLines(inventoryFilePath);
            for (String inventoryItem:inventoryLines){
                String[] inventoryArray = inventoryItem.split(",");
                if (inventoryArray.length >= 4) {
                    String carType = inventoryArray[0];
                    String strOdometer = inventoryArray[1];
                    int odometer = Integer.parseInt(strOdometer);
                    String strMilesPerGallon = inventoryArray[2];
                    int milesPerGallon = Integer.parseInt(strMilesPerGallon);
                    String strGallonsOfGas = inventoryArray[3];
                    double gallonsOfGas = Double.parseDouble(strGallonsOfGas);
                    Vehicle vehicle = Driver.createVehicle(carType);
                    vehicle.setOdometer(odometer);
                    vehicle.setGallonsOfGas(gallonsOfGas);
                    vehicle.setMilesPerGallon(milesPerGallon);
                    allVehicles.add(vehicle);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void runVehicle() {
        for (Vehicle vehicle : allVehicles) {
            System.out.println(vehicle);
            vehicle.go(100);
            System.out.println(vehicle);
        }
    }
}
