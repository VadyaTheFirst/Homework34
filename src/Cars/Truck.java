package Cars;

import Cars.Car;
import Cars.Challenging;

public final class Truck extends Car implements Challenging,DrivenByLicenseB {
    private float loadCapacity;

    public Truck(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume, float loadCapacity) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);
        if (loadCapacity<1){
            loadCapacity=1;
        } else {
            this.loadCapacity=loadCapacity;
        }
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void maxChallangeSpeed() {

    }

    @Override
    public String drivenBy() {
       String s1=" гоняет на грузовике "+getModel()+" "+getBrand();
        return s1;
    }

    @Override
    public void bestCircleTime() {




    }
}
