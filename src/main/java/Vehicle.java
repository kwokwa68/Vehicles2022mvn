//this effectively is a Java Bean or a DTO (data transfer object)
//usually don't have behavior methods
public class Vehicle {
    private int milesPerGallon = 20;
    private double gallonsOfGas = 10.0;
    private int odometer = 0;

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void go(int milesDriven) {
        setGallonsOfGas(getGallonsOfGas() - (milesDriven /getMilesPerGallon()));
        setOdometer(getOdometer() + milesDriven);
    }

    @Override
    public String toString() {
        return "Odometer " + getOdometer() + " Gallons of Gas " + getGallonsOfGas();
    }
}
