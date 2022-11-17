package Drivers;

import Cars.Bus;
import Cars.Car;
import Cars.Truck;

public class CarLicenseB extends CarLicense<Truck> {
    public CarLicenseB(CarDriver driver) {
        super(driver, "B");
    }
}

