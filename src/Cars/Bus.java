package Cars;

import Cars.Car;

public final class Bus extends Car implements Challenging,DrivenByLicenseC {
    private int seatsNumber;

    @Override
    public void pitStop() {

    }

    @Override
    public void maxChallangeSpeed() {

    }

    @Override
    public void bestCircleTime() {

    }

    public Bus(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume, int seatsNumber) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);

        if (seatsNumber<8){
            this.seatsNumber=8;
        } else {
            this.seatsNumber=seatsNumber;
        }



    }

    @Override
        public String drivenBy() {
            String s1=" гоняет на автобусе "+getModel()+" "+getBrand();
            return s1;
        }
    }

