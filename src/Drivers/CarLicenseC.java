package Drivers;

import Cars.Bus;
import Cars.LightWeight;
import Cars.Truck;

public class CarLicenseC <T extends Bus> {
    private T car;
    private CarDriver driver;
    private static final String licenceType = "C";

    public CarLicenseC(CarDriver driver) {
        this.driver = driver;

    }

    public void drives(T car){
        if (!driver.getHasDriverLicense()){
            System.out.println("У этого водителя нет прав");
        } else {
            System.out.println(driver.getFIO() + " с лицензией "+licenceType +" "+ car.getBrand());
        }
    }
}
