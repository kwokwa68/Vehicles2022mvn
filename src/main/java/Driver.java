import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Driver {
    private static ArrayList<Vehicle> allVehicles = new ArrayList<>();

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
}