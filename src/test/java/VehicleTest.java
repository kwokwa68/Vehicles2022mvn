import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//JUnit Test classes are just Java classes with specific JUnit annotations
//Testing frameworks would then pick up on those annotations as well as "Test" classes
public class VehicleTest {
    protected Vehicle vehicle;

    @Test
    protected void go(){
        //behavior driven design syntax [given (conditions), when (action), then (results)]
        //straight from the requirements!
        given_0Odometer_5GallonsOfGas_20MilesPerGallon();
        when_Driven100miles();
        then_OdometerIncreaseBy100_GallonsOfGasDecreaseBy5();
    }

    protected void given_0Odometer_5GallonsOfGas_20MilesPerGallon() {
        vehicle = new Vehicle();
        vehicle.setOdometer(0);
        vehicle.setGallonsOfGas(15);
        vehicle.setMilesPerGallon(20);
    }

    protected void when_Driven100miles() {
        vehicle.go(100);
    }

    protected void then_OdometerIncreaseBy100_GallonsOfGasDecreaseBy5() {
        assertEquals(100, vehicle.getOdometer());
        assertEquals(10, vehicle.getGallonsOfGas());
    }
}
