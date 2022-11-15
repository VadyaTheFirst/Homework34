import Cars.Bus;


public class LicenseC extends Driver{
    public LicenseC(String FIO, String hasDriverLicense, int workingExperience) {
        super(FIO,hasDriverLicense, workingExperience);
        setHasDriverLicense("C");
    }

    public void drives(Bus bus){
        System.out.println("Воодитель с правами категории С управляет " + bus.getModel());
    }
}
