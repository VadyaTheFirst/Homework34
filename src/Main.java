import Cars.Bus;
import Cars.Car;
import Cars.LightWeight;
import Cars.Truck;

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
        cars[4] = new Bus("Mercedes-Benz", "?",
                2019,"Германия","Желтый", 130,3.2f,30);
        cars[5]= new Truck("MAC", "Гтлтщцт",
                2021,"Sweden","Синий", 130,4.2f,8.5f);

        LicenseA<LightWeight> driverA=new LicenseA<>("Шумахер","A",10);
        LicenseA.drive(cars[0]);



    }
}


