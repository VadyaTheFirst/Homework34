import Cars.*;

import Drivers.CarDriver;
import Drivers.CarLicenseA;
import Drivers.CarLicenseB;
import Drivers.CarLicenseC;

public class Main {
    public static void main(String[] args) {


        Car[] cars = new Car[6];
        cars[0] = new LightWeight("Lada", "Granta",
                2022,"Россия","Черная", 100,1.2f);
        cars[1] = new Bus("УАЗ", "Буханка",
                2019,"Россия","Зеленый", 80,3.2f,12);
        cars[2]= new Truck("МАЗ", "Камаз",
                1998,"Россия","Синий", 80,4.2f,12.5f);
        cars[3] = new LightWeight("Labborghini", "Galado",
                2022,"Italy","Yellow", 340,12.5f);
        cars[4] = new Bus("Mercedes-Benz", "Крутой",
                2019,"Германия","Желтый", 130,3.2f,30);
        cars[5]= new Truck("MAC", "Гтлтщцт",
                2021,"Sweden","Синий", 130,4.2f,8.5f);



        for (Car car : cars) {
            System.out.println(car.toString());

        }

        LightWeight carA= new LightWeight("Lada", "Granta",
                2022,"Россия","Черная", 100,1.2f);
        Truck carB= new Truck("МАЗ", "Камаз",
                1998,"Россия","Синий", 80,4.2f,12.5f);
        Bus carC = new Bus("Mercedes-Benz", "?",
                2019,"Германия","Желтый", 130,3.2f,30);

        CarDriver driverA=new CarDriver("Шумахер",true,5);
        CarLicenseA<LightWeight> licenseA= new CarLicenseA<>(driverA);
        licenseA.drives(carA);

        CarDriver driverB=new CarDriver("Федя Волков",true,4);
        CarLicenseB<Truck> licenseB= new CarLicenseB<>(driverB);
        licenseB.drives(carB);


        CarDriver driverC=new CarDriver("Коля Бухой",false,4);
        CarLicenseC<Bus> licenseC=new CarLicenseC<>(driverC);
        licenseC.drives(carC);





        }





    }



