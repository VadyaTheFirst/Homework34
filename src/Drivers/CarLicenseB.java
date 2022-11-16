package Drivers;

import Cars.Bus;
import Cars.Car;
import Cars.Truck;

public class CarLicenseB<T extends Truck> {
    private T car;
    private CarDriver driver;
    private static final String licenceType = "B";

    public CarLicenseB(CarDriver driver) {
        this.driver = driver;

    }

    public void drives(T car){
        if (!driver.getHasDriverLicense()){
            System.out.println("У этого водителя нет прав");
        } else {
            System.out.println(driver.getFIO() + " с лицензией "+licenceType + " "+car.getBrand());
        }
    }

}
