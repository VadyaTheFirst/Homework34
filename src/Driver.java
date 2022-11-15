import Cars.Car;
import Cars.Truck;

public abstract class Driver {

    private final String FIO;
    private String hasDriverLicense;
    private int workingExperience;

    public Driver(String FIO, String hasDriverLicense, int workingExperience) {
        this.FIO = FIO;
        this.hasDriverLicense = hasDriverLicense;
        this.workingExperience = workingExperience;
    }

    public String getFIO() {
        return FIO;
    }

    public String getHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(String hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(byte workingExperience) {
        this.workingExperience = workingExperience;
    }

    public void beginToMove(){
        System.out.println("Зажигание и вперед!");
    };
    public void stop(){
        System.out.println("Торможу");
    };

    public void refill(){
        System.out.println("Заправляю");
    }



}
