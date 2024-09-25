public class SonicTest extends VehicleTest {
    protected void given_0Odometer_5GallonsOfGas_20MilesPerGallon() {
        vehicle = new Sonic();
        vehicle.setOdometer(0);
        vehicle.setGallonsOfGas(15);
        vehicle.setMilesPerGallon(20);
    }
}
