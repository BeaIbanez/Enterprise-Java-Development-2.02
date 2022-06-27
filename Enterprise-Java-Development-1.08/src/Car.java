public abstract class Car {

    private String vinNumber;
    private String make;
    private String model;
    private double mileage;

    public Car(String vinNumber, String make, String model, double mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car {" +
                "vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
