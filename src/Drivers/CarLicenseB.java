package Drivers;

import Cars.Car;
import Cars.DrivenByLicenseB;
import Cars.Truck;

public class CarLicenseB<T extends Car & DrivenByLicenseB> {
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
            System.out.println(driver.getFIO() + " с лицензией "+licenceType + car.drivenBy());
        }
    }

}
