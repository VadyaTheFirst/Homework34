import Cars.Car;
import Cars.LightWeight;

public class LicenseA extends Driver<T extends LightWeight>{
    private T car;




    public LicenseA(String FIO, String hasDriverLicense, int workingExperience) {
        super(FIO, hasDriverLicense, workingExperience);

       // setHasDriverLicense("A");
    }

    public void drive(T car){
        System.out.println("Водитель с категорией А управляет " +T.getModel());
    }
}
