public class Sedan extends Car{

    public Sedan(String vinNumber, String make, String model, double mileage) {
        super(vinNumber, make, model, mileage);
    }

    public void crarSedan(){
        System.out.println("Esto es un sedan: ");
    }

    @Override
    public String getVinNumber() {
        return super.getVinNumber();
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getMileage() {
        return super.getMileage();
    }

    @Override
    public String toString() {
        return "Sedan{} " +
                "vinNumber='" + super.getVinNumber() + '\'' +
                ", make='" + super.getMake() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", mileage=" + super.getMileage() +
                '}';
    }
}
