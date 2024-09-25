import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Driver {
    public static final String SONIC = "Sonic";
    public static final String MUSTANG = "Mustang";
    public static final String PRIUS = "Prius";
    private static ArrayList<Vehicle> allVehicles = new ArrayList<>();

    private static Driver driver = null;

    public static void main(String[] args) {
        System.out.println("In Vehicles Main");
        promptUser();
        displayOutput();
    }


    public static void promptUser(){
        do {
            String nickname = JOptionPane.showInputDialog("Car name?");

            Vehicle vehicle = new Vehicle();
            int milesPerGallon = Integer.parseInt(JOptionPane.showInputDialog("MPG?"));
            vehicle.setMilesPerGallon(milesPerGallon);

            double gallonsOfGas = Double.parseDouble(JOptionPane.showInputDialog("Enter Gallon"));
            vehicle.setGallonsOfGas(gallonsOfGas);

            int odometer = Integer.parseInt(JOptionPane.showInputDialog("Enter Odometer"));
            vehicle.setOdometer(odometer);
            allVehicles.add(vehicle);
        } while (JOptionPane.showConfirmDialog(null, "More Vehicles?", "Go Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);
    }

    private static void displayOutput() {
        do {
            int milesDriven = Integer.parseInt(JOptionPane.showInputDialog("How far do you want to go?"));
            for (Vehicle vehicle: allVehicles) {
                System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonsOfGas());
                vehicle.go(milesDriven);
                System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonsOfGas());
            }
        } while (JOptionPane.showConfirmDialog(null, "Do another trip?", "Go Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);
    }

    /**
     * Simple factory method to create and return a subclass of type Vehicle.
     *
     * @param selectedVehicle A string representing the vehicle we want to create.
     * @return the created vehicle.
     */
    public static Vehicle createVehicle(final Object selectedVehicle) {
        Vehicle vehicle = null;
        if (selectedVehicle.toString().equals(SONIC)) {
            vehicle = new Sonic();
        } else if (selectedVehicle.toString().equals(MUSTANG)) {
            Mustang mustang = new Mustang();
            vehicle = mustang;
        } else if (selectedVehicle.toString().equals(PRIUS)) {
            Prius prius = new Prius();
            applyForTaxCredit(prius);
            vehicle = prius;
        }
        return vehicle;
    }

    public static void applyForTaxCredit(LowEmissionVehicle lev) {
        lev.applyTaxRebate(100);
    }
}