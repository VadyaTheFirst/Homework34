package Drivers;

import Cars.DrivenByLicenseA;
import Cars.LightWeight;

public class CarLicenseA<T extends LightWeight & DrivenByLicenseA>  {
private T car;
private CarDriver driver;
private static final String licenceType = "A";

    public CarLicenseA(CarDriver driver) {
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
