package Drivers;

import Cars.Car;
import Cars.LightWeight;

public class CarLicenseA extends CarLicense<LightWeight> {
    public CarLicenseA(CarDriver driver) {
        super(driver, "A");
    }
}
